package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.VSSView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/19 16:15
 */
public class 设置 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private VSSView m修改手机号;
    private VSSView m收货地址管理;
    private VSSView m清除缓存;
    /**
     * 退出登录
     */
    private Button m退出登录;

    @Override
    public int initLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m修改手机号 = (VSSView) findViewById(R.id.修改手机号);
        m修改手机号.setOnClickListener(this);
        m收货地址管理 = (VSSView) findViewById(R.id.收货地址管理);
        m收货地址管理.setOnClickListener(this);
        m清除缓存 = (VSSView) findViewById(R.id.清除缓存);
        m清除缓存.setOnClickListener(this);
        m退出登录 = (Button) findViewById(R.id.退出登录);
        m退出登录.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.修改手机号:
                break;
            case R.id.收货地址管理:
                break;
            case R.id.清除缓存:
                break;
            case R.id.退出登录:
                break;
        }
    }
}
