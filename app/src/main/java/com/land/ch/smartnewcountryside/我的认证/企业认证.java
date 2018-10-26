package com.land.ch.smartnewcountryside.我的认证;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 13:22
 */
public class 企业认证 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 如何快速完成认证?
     */
    private TextView m快速认证tv;
    /**
     * 开始认证
     */
    private Button m开始认证btn;
    /**
     * 点击即表示同意《智慧新农村企业认证协议》
     */
    private TextView m企业认证协议tv;

    @Override
    public int initLayout() {
        return R.layout.activity_qiyerenzheng;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("企业认证");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m快速认证tv = (TextView) findViewById(R.id.快速认证tv);
        m快速认证tv.setOnClickListener(this);
        m开始认证btn = (Button) findViewById(R.id.开始认证btn);
        m开始认证btn.setOnClickListener(this);
        m企业认证协议tv = (TextView) findViewById(R.id.企业认证协议tv);
        m企业认证协议tv.setOnClickListener(this);
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
            case R.id.快速认证tv:
                break;
            case R.id.开始认证btn:
                break;
            case R.id.企业认证协议tv:
                break;
        }
    }
}
