package com.land.ch.smartnewcountryside.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.zhy.autolayout.AutoRelativeLayout;

/**
 * Created by CH
 * on 2018/10/16 16:26
 */
public class 农产品 extends Fragment implements View.OnClickListener {

    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private AutoSwitchView mBanner;
    private RecyclerView mRecyclerview1;
    private ImageView m广告img;
    private RecyclerView mRecyclerview2;
    private RecyclerView mDetailRecycler;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_nongchanpin, null);
        return mView;
    }

    public void initView() {

        mHomeAddressTv = (ImageView) mView.findViewById(R.id.home_address_tv);
        m搜索rlc = (AutoRelativeLayout) mView.findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        m浏览记录img = (ImageView) mView.findViewById(R.id.浏览记录img);
        m浏览记录img.setOnClickListener(this);
        mBanner = (AutoSwitchView) mView.findViewById(R.id.banner);
        mRecyclerview1 = (RecyclerView) mView.findViewById(R.id.recyclerview1);
        m广告img = (ImageView) mView.findViewById(R.id.广告img);
        m广告img.setOnClickListener(this);
        mRecyclerview2 = (RecyclerView) mView.findViewById(R.id.recyclerview2);
        mDetailRecycler = (RecyclerView) mView.findViewById(R.id.detail_recycler);
    }

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
