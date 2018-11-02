package com.land.ch.smartnewcountryside.我的特权;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 婚恋特权 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    /**
     * 咨询
     */
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private WebView mWebView;
    /**
     * 立即购买
     */
    private Button m立即购买btn;


    @Override
    public int initLayout() {
        return R.layout.activity_hunliantequan;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mWebView = (WebView) findViewById(R.id.WebView);
        m立即购买btn = (Button) findViewById(R.id.立即购买btn);
        m立即购买btn.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.layout_title_text:
                break;
            case R.id.立即购买btn:
                break;
        }
    }
}
