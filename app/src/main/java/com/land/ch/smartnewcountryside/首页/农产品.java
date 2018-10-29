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
 * on 2018/10/29 13:29
 */
public class 农产品 extends BaseActivity implements View.OnClickListener {

    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private AutoSwitchView mBanner;
    private RecyclerView mRecyclerview1;
    private ImageView m广告img;
    private RecyclerView mRecyclerview2;
    private RecyclerView mDetailRecycler;
    private View mView;


    @Override
    public int initLayout() {
        return R.layout.fragment_nongchanpin;
    }

    @Override
    public void initView() {
        mHomeAddressTv = (ImageView) findViewById(R.id.home_address_tv);
        mHomeAddressTv.setVisibility(View.INVISIBLE);
        m搜索rlc = (AutoRelativeLayout) findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        m浏览记录img = (ImageView) findViewById(R.id.浏览记录img);
        m浏览记录img.setOnClickListener(this);
        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mRecyclerview1 = (RecyclerView) findViewById(R.id.recyclerview1);
        m广告img = (ImageView) findViewById(R.id.广告img);
        m广告img.setOnClickListener(this);
        mRecyclerview2 = (RecyclerView) findViewById(R.id.recyclerview2);
        mDetailRecycler = (RecyclerView) findViewById(R.id.detail_recycler);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.搜索rlc:
                break;
            case R.id.浏览记录img:
                break;
            case R.id.广告img:
                break;
        }
    }
}
