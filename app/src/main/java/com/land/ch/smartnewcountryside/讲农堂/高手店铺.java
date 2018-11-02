package com.land.ch.smartnewcountryside.讲农堂;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.MyRatingBar;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;
import ch.chtool.view.MyListView;

public class 高手店铺 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    /**
     * 分享
     */
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m头像img;
    /**
     * 姓名
     */
    private TextView m姓名tv;
    /**
     * 地址
     */
    private TextView m地址tv;
    /**
     * 身份
     */
    private TextView m身份tv;
    private MyRatingBar mMyRatingBar;
    /**
     * 4.7
     */
    private TextView m等级tv;
    /**
     * (18评价)
     */
    private TextView m评论数tv;
    private ImageView m身份img;
    /**
     * 在售供应(1)
     */
    private TextView m在售供应tv;
    private MyListView mMyListView;
    /**
     * 加关注
     */
    private Button m加关注tv;
    /**
     * 聊一聊
     */
    private Button m聊一聊btn;
    /**
     * 人气   1
     */
    private Button m人气btn;

    @Override
    public int initLayout() {
        return R.layout.activity_gaoshoudianpu;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m头像img = (ImageView) findViewById(R.id.头像img);
        m头像img.setOnClickListener(this);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m地址tv = (TextView) findViewById(R.id.地址tv);
        m身份tv = (TextView) findViewById(R.id.身份tv);
        mMyRatingBar = (MyRatingBar) findViewById(R.id.MyRatingBar);
        m等级tv = (TextView) findViewById(R.id.等级tv);
        m评论数tv = (TextView) findViewById(R.id.评论数tv);
        m身份img = (ImageView) findViewById(R.id.身份img);
        m在售供应tv = (TextView) findViewById(R.id.在售供应tv);
        mMyListView = (MyListView) findViewById(R.id.MyListView);
        m加关注tv = (Button) findViewById(R.id.加关注tv);
        m加关注tv.setOnClickListener(this);
        m聊一聊btn = (Button) findViewById(R.id.聊一聊btn);
        m聊一聊btn.setOnClickListener(this);
        m人气btn = (Button) findViewById(R.id.人气btn);
        m人气btn.setOnClickListener(this);
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
            case R.id.头像img:
                break;
            case R.id.加关注tv:
                break;
            case R.id.聊一聊btn:
                break;
            case R.id.人气btn:
                break;
        }
    }
}
