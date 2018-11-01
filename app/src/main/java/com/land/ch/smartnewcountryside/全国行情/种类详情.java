package com.land.ch.smartnewcountryside.全国行情;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 种类详情 extends BaseActivity implements View.OnClickListener {

    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private RecyclerView mRecyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_zhongleixiangqing;
    }

    public void initView() {
        mHomeAddressTv = (ImageView) findViewById(R.id.home_address_tv);
        mHomeAddressTv.setOnClickListener(this);
        m搜索rlc = (AutoRelativeLayout) findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        m浏览记录img = (ImageView) findViewById(R.id.浏览记录img);
        m浏览记录img.setOnClickListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
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
            case R.id.搜索rlc:
                break;
            case R.id.浏览记录img:
                break;
        }
    }
}
