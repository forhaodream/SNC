package com.land.ch.smartnewcountryside.生意圈;

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
 * on 2018/10/29 17:07
 */
public class 动态详情 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m头像img;
    private TextView m姓名tv;
    private TextView m时间tv;
    private ImageView mDetailImg;
    private AutoRelativeLayout m加关注rlc;
    private AutoRelativeLayout m聊一聊rlc;
    private AutoRelativeLayout m打电话rlc;
    private TextView m浏览次数tv;
    private RecyclerView mRecyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_dongtaixiangqing;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m头像img = (ImageView) findViewById(R.id.头像img);
        m头像img.setOnClickListener(this);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m时间tv = (TextView) findViewById(R.id.时间tv);
        mDetailImg = (ImageView) findViewById(R.id.detail_img);
        m加关注rlc = (AutoRelativeLayout) findViewById(R.id.加关注rlc);
        m加关注rlc.setOnClickListener(this);
        m聊一聊rlc = (AutoRelativeLayout) findViewById(R.id.聊一聊rlc);
        m聊一聊rlc.setOnClickListener(this);
        m打电话rlc = (AutoRelativeLayout) findViewById(R.id.打电话rlc);
        m打电话rlc.setOnClickListener(this);
        m浏览次数tv = (TextView) findViewById(R.id.浏览次数tv);
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
            case R.id.头像img:
                break;
            case R.id.加关注rlc:
                break;
            case R.id.聊一聊rlc:
                break;
            case R.id.打电话rlc:
                break;
        }
    }
}
