package com.land.ch.smartnewcountryside.全城热恋;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.DropDownMenu;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 09:45
 */
public class 全城热恋 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    /**
     * 全网热恋
     */
    private TextView mLayoutTitleText;
    /**
     * 发布
     */
    private TextView m发布tv;
    private AutoRelativeLayout mLayoutTitleRlc;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwiperefresh;
    private DropDownMenu mDropDownMenu;

    @Override
    public int initLayout() {
        return R.layout.activity_quanchengrelian;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        m发布tv = (TextView) findViewById(R.id.发布tv);
        m发布tv.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mSwiperefresh = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        mDropDownMenu = (DropDownMenu) findViewById(R.id.dropDownMenu);
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
            case R.id.发布tv:
                startActivity(new Intent(全城热恋.this, 全网热恋发布.class));
                break;
        }
    }
}