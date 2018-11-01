package com.land.ch.smartnewcountryside.我的认证;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.nex3z.flowlayout.FlowLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 13:23
 */
public class 农资资质 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 您的姓名:
     */
    private TextView m姓名tv;
    /**
     * 您的身份:
     */
    private TextView m身份tv;
    private ImageView m上传img;
    private ImageView m点击查看示例img;
    private FlowLayout mFlowLayout;
    private CheckBox mCheckBox;
    /**
     * 提交认证
     */
    private Button m提交认证btn;

    @Override
    public int initLayout() {
        return R.layout.activity_nongzizizhi;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m身份tv = (TextView) findViewById(R.id.身份tv);
        m上传img = (ImageView) findViewById(R.id.上传img);
        m上传img.setOnClickListener(this);
        m点击查看示例img = (ImageView) findViewById(R.id.点击查看示例img);
        m点击查看示例img.setOnClickListener(this);
        mFlowLayout = (FlowLayout) findViewById(R.id.FlowLayout);
        mCheckBox = (CheckBox) findViewById(R.id.CheckBox);
        m提交认证btn = (Button) findViewById(R.id.提交认证btn);
        m提交认证btn.setOnClickListener(this);
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
            case R.id.上传img:
                break;
            case R.id.点击查看示例img:
                break;
            case R.id.提交认证btn:
                break;
        }
    }
}
