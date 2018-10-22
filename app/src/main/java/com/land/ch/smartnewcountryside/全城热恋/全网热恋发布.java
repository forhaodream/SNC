package com.land.ch.smartnewcountryside.全城热恋;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.VSSView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 11:40
 */
public class 全网热恋发布 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private TextView m确认tv;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m头像img;
    private VSSView m姓名VSSView;
    private VSSView m性别VSSView;
    private VSSView m年龄VSSView;
    private VSSView m兴趣爱好VSSView;
    private VSSView m工作VSSView;
    private VSSView m现居VSSView;
    private VSSView m婚史VSSView;
    private VSSView m恋爱要求VSSView;
    private EditText m个人简介ed;
    private ImageView m个人秀img;

    @Override
    public int initLayout() {
        return R.layout.activity_quanwangrelianfabu;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        m确认tv = (TextView) findViewById(R.id.确认tv);
        m确认tv.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m头像img = (ImageView) findViewById(R.id.头像img);
        m头像img.setOnClickListener(this);
        m姓名VSSView = (VSSView) findViewById(R.id.姓名VSSView);
        m性别VSSView = (VSSView) findViewById(R.id.性别VSSView);
        m年龄VSSView = (VSSView) findViewById(R.id.年龄VSSView);
        m兴趣爱好VSSView = (VSSView) findViewById(R.id.兴趣爱好VSSView);
        m工作VSSView = (VSSView) findViewById(R.id.工作VSSView);
        m现居VSSView = (VSSView) findViewById(R.id.现居VSSView);
        m婚史VSSView = (VSSView) findViewById(R.id.婚史VSSView);
        m恋爱要求VSSView = (VSSView) findViewById(R.id.恋爱要求VSSView);
        m个人简介ed = (EditText) findViewById(R.id.个人简介ed);
        m个人秀img = (ImageView) findViewById(R.id.个人秀img);
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
            case R.id.确认tv:
                break;
            case R.id.头像img:
                break;
        }
    }
}
