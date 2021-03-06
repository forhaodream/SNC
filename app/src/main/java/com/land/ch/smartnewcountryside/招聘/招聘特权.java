package com.land.ch.smartnewcountryside.招聘;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/17 10:06
 */
public class 招聘特权 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private WebView mWebView;
    /**
     * 立即购买
     */
    private Button m立即购买btn;

    /**
     * 设置布局
     *
     * @return
     */
    @Override
    public int initLayout() {
        return R.layout.activity_zhaopintequan;
    }

    /**
     * 初始化布局
     */
    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("招聘特权");
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mWebView = (WebView) findViewById(R.id.WebView);
        m立即购买btn = (Button) findViewById(R.id.立即购买btn);
        m立即购买btn.setOnClickListener(this);
    }

    /**
     * 设置数据
     */
    @Override
    public void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.立即购买btn:
                break;
            case R.id.layout_title_text:
                break;
        }
    }


}
