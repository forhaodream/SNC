package com.land.ch.smartnewcountryside.物流叫车;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/16 14:46
 */
public class 我的发布 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView mImg;
    private RecyclerView mRecyclerView;
    private AutoRelativeLayout m发布货源rlc;

    @Override
    public int initLayout() {
        return R.layout.activity_wodefabu;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("我的发布");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mImg = (ImageView) findViewById(R.id.img);
        mImg.setOnClickListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        m发布货源rlc = (AutoRelativeLayout) findViewById(R.id.发布货源rlc);
        m发布货源rlc.setOnClickListener(this);
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
            case R.id.img:
                break;
            case R.id.发布货源rlc:
                break;
        }
    }
}
