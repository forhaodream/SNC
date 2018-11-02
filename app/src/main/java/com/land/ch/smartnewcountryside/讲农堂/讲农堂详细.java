package com.land.ch.smartnewcountryside.讲农堂;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/23 13:21
 */
public class 讲农堂详细 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private RecyclerView mRecyclerView;
    private TextView m分享tv;
    private WebView mWebview;
    private ImageView m头像img;
    /**
     * 青岛亚瑟度进出口贸易有限公司
     */
    private TextView mTitleTv;
    /**
     * 农资厂商
     */
    private TextView m农资厂商tv;
    private AutoRelativeLayout m加关注rlc;
    private AutoRelativeLayout m聊一聊rlc;
    private AutoRelativeLayout m打电话rlc;
    /**
     * 232313123次浏览  45评论
     */
    private TextView m浏览次数tv;
    /**
     * 在这里评论...请勿发广告哦
     */
    private EditText mEditview;
    private ImageView m点赞img;
    /**
     * 45
     */
    private TextView m评论数tv;
    private AutoRelativeLayout m评论rlc;

    @Override
    public int initLayout() {
        return R.layout.activity_jiangnongtangxiangqing;
    }

    @Override
    public void initView() {


        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        m分享tv = (TextView) findViewById(R.id.分享tv);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mWebview = (WebView) findViewById(R.id.webview);
        m头像img = (ImageView) findViewById(R.id.头像img);
        mTitleTv = (TextView) findViewById(R.id.title_tv);
        m农资厂商tv = (TextView) findViewById(R.id.农资厂商tv);
        m加关注rlc = (AutoRelativeLayout) findViewById(R.id.加关注rlc);
        m加关注rlc.setOnClickListener(this);
        m聊一聊rlc = (AutoRelativeLayout) findViewById(R.id.聊一聊rlc);
        m聊一聊rlc.setOnClickListener(this);
        m打电话rlc = (AutoRelativeLayout) findViewById(R.id.打电话rlc);
        m打电话rlc.setOnClickListener(this);
        m浏览次数tv = (TextView) findViewById(R.id.浏览次数tv);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        mEditview = (EditText) findViewById(R.id.editview);
        m点赞img = (ImageView) findViewById(R.id.点赞img);
        m点赞img.setOnClickListener(this);
        m评论数tv = (TextView) findViewById(R.id.评论数tv);
        m评论数tv.setOnClickListener(this);
        m评论rlc = (AutoRelativeLayout) findViewById(R.id.评论rlc);
        m评论rlc.setOnClickListener(this);
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
            case R.id.加关注rlc:
                break;
            case R.id.聊一聊rlc:
                break;
            case R.id.打电话rlc:
                break;
            case R.id.点赞img:
                break;
            case R.id.评论数tv:
                break;
            case R.id.评论rlc:
                break;
        }
    }

}
