package com.land.ch.smartnewcountryside.广告位;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;

import ch.chtool.base.BaseActivity;

public class 广告页详细 extends BaseActivity implements View.OnClickListener {

    private WebView mWebview;
    private ImageView mCsdBack;


    @Override
    public int initLayout() {
        return R.layout.activity_ads_detail;
    }

    @Override
    public void initView() {
        mWebview = (WebView) findViewById(R.id.webview);
        mCsdBack = (ImageView) findViewById(R.id.csd_back);
        mCsdBack.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.csd_back:
                finish();
                break;
        }
    }
}
