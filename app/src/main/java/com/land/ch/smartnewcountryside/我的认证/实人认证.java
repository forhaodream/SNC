package com.land.ch.smartnewcountryside.我的认证;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 13:22
 */
public class 实人认证 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 在这里填写姓名
     */
    private EditText mEdName;
    /**
     * 在这里填写 18 位身份证号码
     */
    private EditText mEdIdcard;
    /**
     * 开始认证
     */
    private Button m开始认证btn;


    private Handler mHandler;

    @Override
    public int initLayout() {
        mHandler = new Handler();
        return R.layout.activity_shirenrenzheng;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("实人认证");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mEdName = (EditText) findViewById(R.id.ed_name);
        mEdName.setCursorVisible(false);
        mEdIdcard = (EditText) findViewById(R.id.ed_idcard);
        mEdIdcard.setCursorVisible(false);
        m开始认证btn = (Button) findViewById(R.id.开始认证btn);
        m开始认证btn.setOnClickListener(this);
        mEdName.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!TextUtils.isEmpty(mEdName.getText()) && !TextUtils.isEmpty(mEdIdcard.getText())) {
                    m开始认证btn.setBackgroundResource(R.color.theme_green);
                } else {
                    m开始认证btn.setBackgroundResource(R.color.gray);
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        mEdIdcard.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!TextUtils.isEmpty(mEdName.getText()) && !TextUtils.isEmpty(mEdIdcard.getText())) {
                    m开始认证btn.setBackgroundResource(R.color.theme_green);
                } else {
                    m开始认证btn.setBackgroundResource(R.color.gray);
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


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
            case R.id.开始认证btn:
                break;
        }
    }
}
