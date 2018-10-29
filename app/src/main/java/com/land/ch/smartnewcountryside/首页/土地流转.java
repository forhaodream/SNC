package com.land.ch.smartnewcountryside.首页;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.land.ch.smartnewcountryside.view.DropDownMenu;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/29 14:50
 */
public class 土地流转 extends BaseActivity implements View.OnClickListener {
    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private AutoSwitchView mBanner;
    private RecyclerView mTypeRecycler;
    private ImageView m土地托管img;
    private ImageView m发布找地img;
    private RecyclerView mKindRecycler;
    private RecyclerView mRecyclerView;
    private DropDownMenu mDropDownMenu;

    @Override
    public int initLayout() {
        return R.layout.activity_tudiliuzhuan;
    }

    @Override
    public void initView() {

        mHomeAddressTv = (ImageView) findViewById(R.id.home_address_tv);
        mHomeAddressTv.setOnClickListener(this);
        m搜索rlc = (AutoRelativeLayout) findViewById(R.id.搜索rlc);
        m浏览记录img = (ImageView) findViewById(R.id.浏览记录img);
        m浏览记录img.setOnClickListener(this);
        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mTypeRecycler = (RecyclerView) findViewById(R.id.type_recycler);
        m土地托管img = (ImageView) findViewById(R.id.土地托管img);
        m土地托管img.setOnClickListener(this);
        m发布找地img = (ImageView) findViewById(R.id.发布找地img);
        m发布找地img.setOnClickListener(this);
        mKindRecycler = (RecyclerView) findViewById(R.id.kind_recycler);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mDropDownMenu = (DropDownMenu) findViewById(R.id.dropDownMenu);
    }

    @Override
    public void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.home_address_tv:
                break;
            case R.id.浏览记录img:
                break;
            case R.id.土地托管img:
                break;
            case R.id.发布找地img:
                break;
        }
    }
}
