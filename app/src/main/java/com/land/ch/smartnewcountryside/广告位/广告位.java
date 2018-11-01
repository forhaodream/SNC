package com.land.ch.smartnewcountryside.广告位;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;

public class 广告位 extends AppCompatActivity {
    private WebView mWebView;
    private WebSettings webSettings;
    private String webUrl = "";
    private String titleStr = "";
    private TextView titleTv;
    private ImageView returnImg;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guanggao);
        mWebView = new WebView(this);
        mWebView = findViewById(R.id.webview);
        webSettings = mWebView.getSettings();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mWebView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        returnImg = findViewById(R.id.layout_title_back);
        returnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        titleTv = findViewById(R.id.layout_title_text);
        Intent intent = getIntent();
        webUrl = intent.getStringExtra("webUrl");
        titleStr = intent.getStringExtra("titleStr");
        titleTv.setText("广告位标题");
        addWebView(webUrl);
    }

    private void addWebView(String url) {
        webSettings.setBuiltInZoomControls(true);// 隐藏缩放按钮

        webSettings.setUseWideViewPort(true);// 可任意比例缩放
        webSettings.setLoadWithOverviewMode(true);// setUseWideViewPort方法设置webview推荐使用的窗口。setLoadWithOverviewMode方法是设置webview加载的页面的模式。

        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);// 保存表单数据
        webSettings.setJavaScriptEnabled(true);

        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportMultipleWindows(true);// 新加

        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());

        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setSavePassword(false);
        //支持多种分辨率，需要js网页支持
        webSettings.setUserAgentString("mac os");
        webSettings.setDefaultTextEncodingName("utf-8");
        //显示本地js网页

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;

            }
        });
        mWebView.setWebChromeClient(new WebChromeClient());
        //注意第二个参数JsTest，这个是JS网页调用Android方法的一个类似ID的东西
        //自适应屏幕
        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setDisplayZoomControls(false);
        mWebView.clearCache(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("http:") || url.startsWith("https:")) {
                    return false;
                }
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                } catch (Exception e) {
                }
                return true;
            }
        });

        mWebView.loadUrl(url);
    }


}