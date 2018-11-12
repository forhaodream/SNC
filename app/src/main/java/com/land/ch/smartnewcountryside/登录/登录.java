package com.land.ch.smartnewcountryside.登录;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;

import ch.chtool.base.BaseActivity;

public class 登录 extends BaseActivity implements View.OnClickListener {

    private ImageView mBack;
    /**
     * 请输入账号
     */
    private EditText mEdUser;
    /**
     * 请输入密码
     */
    private EditText mEdPsd;
    /**
     * 注册账号
     */
    private TextView m注册tv;
    /**
     * 找回密码
     */
    private TextView m找回tv;
    /**
     * 登录
     */
    private Button m登录btn;


    @Override
    public int initLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        mBack = (ImageView) findViewById(R.id.back);
        mBack.setOnClickListener(this);
        mEdUser = (EditText) findViewById(R.id.ed_user);
        mEdPsd = (EditText) findViewById(R.id.ed_psd);
        m注册tv = (TextView) findViewById(R.id.注册tv);
        m注册tv.setOnClickListener(this);
        m找回tv = (TextView) findViewById(R.id.找回tv);
        m找回tv.setOnClickListener(this);
        m登录btn = (Button) findViewById(R.id.登录btn);
        m登录btn.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.注册tv:
                break;
            case R.id.找回tv:
                break;
            case R.id.登录btn:
                break;
        }
    }
}
