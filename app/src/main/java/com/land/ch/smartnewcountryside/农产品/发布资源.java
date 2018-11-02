package com.land.ch.smartnewcountryside.农产品;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liquorslib.view.VEditText;
import com.example.liquorslib.view.VShowView;
import com.example.liquorslib.view.VTextView;
import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 发布资源 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private VShowView m出发地vss;
    private VEditText m到达地vss;
    private VTextView m车型要求vt;
    private VShowView m货物名称vss;
    private VEditText m货物重量vss;
    private EditText m备注信息ed;
    private Button m确认发布btn;


    @Override
    public int initLayout() {
        return R.layout.activity_fabuziyuan;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m出发地vss = (VShowView) findViewById(R.id.出发地vss);
        m出发地vss.setOnClickListener(this);
        m到达地vss = (VEditText) findViewById(R.id.到达地vss);
        m到达地vss.setOnClickListener(this);
        m车型要求vt = (VTextView) findViewById(R.id.车型要求vt);
        m车型要求vt.setOnClickListener(this);
        m货物名称vss = (VShowView) findViewById(R.id.货物名称vss);
        m货物名称vss.setOnClickListener(this);
        m货物重量vss = (VEditText) findViewById(R.id.货物重量vss);
        m货物重量vss.setOnClickListener(this);
        m备注信息ed = (EditText) findViewById(R.id.备注信息ed);
        m确认发布btn = (Button) findViewById(R.id.确认发布btn);
        m确认发布btn.setOnClickListener(this);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc.setOnClickListener(this);
        m备注信息ed.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.出发地vss:
                break;
            case R.id.到达地vss:
                break;
            case R.id.车型要求vt:
                break;
            case R.id.货物名称vss:
                break;
            case R.id.货物重量vss:
                break;
            case R.id.确认发布btn:
                break;
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.layout_title_text:
                break;
            case R.id.layout_title_rlc:
                break;
            case R.id.备注信息ed:
                break;
        }
    }


}
