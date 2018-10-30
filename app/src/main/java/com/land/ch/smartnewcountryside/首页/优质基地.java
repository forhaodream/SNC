package com.land.ch.smartnewcountryside.首页;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/29 15:10
 */
public class 优质基地 extends BaseActivity implements View.OnClickListener {
    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private AutoSwitchView mBanner;
    private RecyclerView mRecyclerview1;
    private ImageView m广告img;
    private RecyclerView mRecyclerview2;
    private RecyclerView mDetailRecycler;

    @Override
    public int initLayout() {
        return R.layout.activity_kinds;
    }

    @Override
    public void initView() {

        mHomeAddressTv = (ImageView) findViewById(R.id.home_address_tv);
        m搜索rlc = (AutoRelativeLayout) findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        m浏览记录img = (ImageView) findViewById(R.id.浏览记录img);
        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mRecyclerview1 = (RecyclerView) findViewById(R.id.recyclerview1);
        m广告img = (ImageView) findViewById(R.id.广告img);
        mRecyclerview2 = (RecyclerView) findViewById(R.id.recyclerview2);
        mDetailRecycler = (RecyclerView) findViewById(R.id.detail_recycler);
    }

    @Override
    public void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.搜索rlc:
                break;
        }
    }
}