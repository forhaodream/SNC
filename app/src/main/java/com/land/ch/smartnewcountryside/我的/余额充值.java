package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 余额充值 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 请输入充值金额
     */
    private EditText m余额充值ed;
    /**
     * 确认充值
     */
    private Button m确认充值btn;


    @Override
    public int initLayout() {
        return R.layout.activity_yuechognzhi;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m余额充值ed = (EditText) findViewById(R.id.余额充值ed);
        m确认充值btn = (Button) findViewById(R.id.确认充值btn);
        m确认充值btn.setOnClickListener(this);
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
            case R.id.确认充值btn:
                break;
        }
    }
}
