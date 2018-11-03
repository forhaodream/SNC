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

public class 添加村庄 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 村庄名称
     */
    private EditText m村庄名称ed;
    /**
     * 村庄介绍
     */
    private EditText m村庄介绍ed;
    /**
     * 确认添加
     */
    private Button m确认添加btn;


    @Override
    public int initLayout() {
        return R.layout.activity_tianjiacunzhuang;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m村庄名称ed = (EditText) findViewById(R.id.村庄名称ed);
        m村庄介绍ed = (EditText) findViewById(R.id.村庄介绍ed);
        m确认添加btn = (Button) findViewById(R.id.确认添加btn);
        m确认添加btn.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.layout_title_back:
                break;
            case R.id.确认添加btn:
                break;
        }
    }
}
