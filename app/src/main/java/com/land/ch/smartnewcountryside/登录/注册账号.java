package com.land.ch.smartnewcountryside.登录;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 注册账号 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private CheckBox mCheckbox;
    /**
     * 用户协议
     */
    private TextView m用户协议tv;
    /**
     * 注册
     */
    private Button m注册btn;

    @Override
    public int initLayout() {
        return R.layout.activity_zhuce;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mCheckbox = (CheckBox) findViewById(R.id.checkbox);
        m用户协议tv = (TextView) findViewById(R.id.用户协议tv);
        m注册btn = (Button) findViewById(R.id.注册btn);
        m注册btn.setOnClickListener(this);
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
            case R.id.注册btn:
                break;
        }
    }
}
