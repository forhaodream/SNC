package com.land.ch.smartnewcountryside.讲农堂;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;
import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/23 11:50
 */
public class 讲农堂 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private AutoSwitchView mBanner;
    private MyGridView mGridview;
    private ImageView m讲农堂广告img;
    private RecyclerView mRecyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_jiangnongtang;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mGridview = (MyGridView) findViewById(R.id.gridview);
        m讲农堂广告img = (ImageView) findViewById(R.id.讲农堂广告img);
        m讲农堂广告img.setOnClickListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
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
            case R.id.layout_title_text:
                break;
            case R.id.讲农堂广告img:
                break;
        }
    }
}
