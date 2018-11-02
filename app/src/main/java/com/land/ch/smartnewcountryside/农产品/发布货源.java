package com.land.ch.smartnewcountryside.农产品;

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

public class 发布货源 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 湖南越南
     */
    private TextView m手机号tv;
    private AutoRelativeLayout m出发地rlc;
    /**
     * 中国辽宁省沈阳
     */
    private TextView m姓名tv;
    private AutoRelativeLayout m到达地rlc;
    private TextView m车型要求tv;
    private AutoRelativeLayout m车型要求rlc;
    private EditText m货物名称tv;
    private AutoRelativeLayout m货物名称rlc;
    private EditText m货物重量tv;
    private AutoRelativeLayout m货物重量rlc;
    /**
     * 备注信息
     */
    private EditText m备注信息tv;
    private AutoRelativeLayout m备注信息rlc;
    /**
     * 确认发布
     */
    private Button m保存btn;


    @Override
    public int initLayout() {
        return R.layout.activity_fabuhuoyuan;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m手机号tv = (TextView) findViewById(R.id.手机号tv);
        m出发地rlc = (AutoRelativeLayout) findViewById(R.id.出发地rlc);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m到达地rlc = (AutoRelativeLayout) findViewById(R.id.到达地rlc);
        m车型要求tv = (TextView) findViewById(R.id.车型要求tv);
        m车型要求rlc = (AutoRelativeLayout) findViewById(R.id.车型要求rlc);
        m货物名称tv = (EditText) findViewById(R.id.货物名称tv);
        m货物名称rlc = (AutoRelativeLayout) findViewById(R.id.货物名称rlc);
        m货物重量tv = (EditText) findViewById(R.id.货物重量tv);
        m货物重量rlc = (AutoRelativeLayout) findViewById(R.id.货物重量rlc);
        m备注信息tv = (EditText) findViewById(R.id.备注信息tv);
        m备注信息rlc = (AutoRelativeLayout) findViewById(R.id.备注信息rlc);
        m保存btn = (Button) findViewById(R.id.保存btn);
        m保存btn.setOnClickListener(this);
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
            case R.id.保存btn:
                break;
        }
    }
}
