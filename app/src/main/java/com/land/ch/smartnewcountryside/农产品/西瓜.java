package com.land.ch.smartnewcountryside.农产品;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.nex3z.flowlayout.FlowLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/26 14:08
 */
public class 西瓜 extends BaseActivity implements View.OnClickListener {
    private AutoSwitchView mBanner;
    private FlowLayout mKindFlowLayout;
    private TextView m热门产地tv;
    private FlowLayout mAddressFlow;
    private RecyclerView mRecyclerView;
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;

    @Override
    public int initLayout() {
        return R.layout.activity_xigua;
    }

    @Override
    public void initView() {

        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mKindFlowLayout = (FlowLayout) findViewById(R.id.kind_flowLayout);
        m热门产地tv = (TextView) findViewById(R.id.热门产地tv);
        mAddressFlow = (FlowLayout) findViewById(R.id.address_flow);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("西瓜");
        mLayoutTitleText.setOnClickListener(this);
        mBanner.setOnClickListener(this);
        mKindFlowLayout.setOnClickListener(this);
        m热门产地tv.setOnClickListener(this);
        mAddressFlow.setOnClickListener(this);
        mRecyclerView.setOnClickListener(this);
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
            case R.id.layout_title_text:
                break;
            case R.id.banner:
                break;
            case R.id.kind_flowLayout:
                break;
            case R.id.热门产地tv:
                break;
            case R.id.address_flow:
                break;
            case R.id.RecyclerView:
                break;
        }
    }
}
