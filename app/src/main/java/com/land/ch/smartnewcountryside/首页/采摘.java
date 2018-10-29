package com.land.ch.smartnewcountryside.首页;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.nex3z.flowlayout.FlowLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/29 14:04
 */
public class 采摘 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private AutoSwitchView mBanner;
    private FlowLayout mKindFlowLayout;
    private FlowLayout mAddressFlow;
    private RecyclerView mRecyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_caizhai;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("采摘");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mBanner = (AutoSwitchView) findViewById(R.id.banner);
        mKindFlowLayout = (FlowLayout) findViewById(R.id.kind_flowLayout);
        mAddressFlow = (FlowLayout) findViewById(R.id.address_flow);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
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
        }
    }
}
