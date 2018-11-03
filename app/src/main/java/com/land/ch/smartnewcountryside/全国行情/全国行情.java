package com.land.ch.smartnewcountryside.全国行情;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 10:23
 */
public class 全国行情 extends BaseActivity implements View.OnClickListener {
    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private RecyclerView mRecyclerView;
    private AutoSwitchView mFragmentHomeBanner;
    private RecyclerView mTypeRecyclerView;
    private RecyclerView mKindRecyclerView;
    private RecyclerView m下面列表rv;

    @Override
    public int initLayout() {
        return R.layout.activity_quanguohangqing;
    }

    @Override
    public void initView() {


        mHomeAddressTv = (ImageView) findViewById(R.id.home_address_tv);
        mHomeAddressTv.setOnClickListener(this);
        m搜索rlc = (AutoRelativeLayout) findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        mFragmentHomeBanner = (AutoSwitchView) findViewById(R.id.fragment_home_banner);
        mTypeRecyclerView = (RecyclerView) findViewById(R.id.type_RecyclerView);
        mKindRecyclerView = (RecyclerView) findViewById(R.id.kind_RecyclerView);
        m下面列表rv = (RecyclerView) findViewById(R.id.下面列表rv);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_address_tv:
                finish();
                break;
            case R.id.浏览记录img:
                break;
            case R.id.搜索rlc:
                break;
        }
    }

}
