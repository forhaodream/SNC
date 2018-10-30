package com.land.ch.smartnewcountryside.招聘;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liquorslib.view.VEditText;
import com.example.liquorslib.view.VPhotoView;
import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/30 11:15
 */
public class 发布详情 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private TextView m发布tv;
    private AutoRelativeLayout mLayoutTitleRlc;
    private VPhotoView m岗位展示图vph;
    private VEditText m标题vet;
    private VEditText m经验要求vet;
    private VEditText m薪资待遇vet;
    private VEditText m工作地址vet;
    private VEditText m电话vet;

    @Override
    public int initLayout() {
        return R.layout.activity_fabuxiangqing;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("发布详情");
        m发布tv = (TextView) findViewById(R.id.发布tv);
        m发布tv.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m岗位展示图vph = (VPhotoView) findViewById(R.id.岗位展示图vph);
        m标题vet = (VEditText) findViewById(R.id.标题vet);
        m经验要求vet = (VEditText) findViewById(R.id.经验要求vet);
        m薪资待遇vet = (VEditText) findViewById(R.id.薪资待遇vet);
        m工作地址vet = (VEditText) findViewById(R.id.工作地址vet);
        m电话vet = (VEditText) findViewById(R.id.电话vet);
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
            case R.id.发布tv:
                break;
        }
    }
}
