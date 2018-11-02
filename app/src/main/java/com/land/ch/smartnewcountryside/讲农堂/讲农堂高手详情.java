package com.land.ch.smartnewcountryside.讲农堂;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.liquorslib.view.VShowView;
import com.land.ch.smartnewcountryside.R;
import com.makeramen.roundedimageview.RoundedImageView;

import ch.chtool.base.BaseActivity;

public class 讲农堂高手详情 extends BaseActivity implements View.OnClickListener {

    private RoundedImageView m头像img;
    /**
     * 山东聊城市
     */
    private TextView m地址tv;
    /**
     * 经办人/代办
     */
    private TextView m身份tv;
    /**
     * 主营/西瓜
     */
    private TextView m主营tv;
    /**
     * 1693人
     */
    private TextView m浏览人数tv;
    /**
     * 41人
     */
    private TextView m关注人数tv;
    /**
     * 89人
     */
    private TextView m历史联系人数tv;
    /**
     * 53天
     */
    private TextView m持续经营tv;
    private VShowView m去店铺vs;
    private RecyclerView mRecyclerView;
    private VShowView m更多vs;
    private RecyclerView mRecyclerView2;
    private VShowView m诚信等级vs;
    /**
     * 评价他
     */
    private Button m加关注tv;
    /**
     * 聊一聊
     */
    private Button m聊一聊btn;
    /**
     * 打电话
     */
    private Button m打电话btn;

    @Override
    public int initLayout() {
        return R.layout.activity_gaoshouxiangqing;
    }

    @Override
    public void initView() {
        m头像img = (RoundedImageView) findViewById(R.id.头像img);
        m头像img.setOnClickListener(this);
        m地址tv = (TextView) findViewById(R.id.地址tv);
        m身份tv = (TextView) findViewById(R.id.身份tv);
        m主营tv = (TextView) findViewById(R.id.主营tv);
        m浏览人数tv = (TextView) findViewById(R.id.浏览人数tv);
        m关注人数tv = (TextView) findViewById(R.id.关注人数tv);
        m历史联系人数tv = (TextView) findViewById(R.id.历史联系人数tv);
        m持续经营tv = (TextView) findViewById(R.id.持续经营tv);
        m去店铺vs = (VShowView) findViewById(R.id.去店铺vs);
        m去店铺vs.setOnClickListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        m更多vs = (VShowView) findViewById(R.id.更多vs);
        m更多vs.setOnClickListener(this);
        mRecyclerView2 = (RecyclerView) findViewById(R.id.RecyclerView2);
        m诚信等级vs = (VShowView) findViewById(R.id.诚信等级vs);
        m诚信等级vs.setOnClickListener(this);
        m加关注tv = (Button) findViewById(R.id.加关注tv);
        m加关注tv.setOnClickListener(this);
        m聊一聊btn = (Button) findViewById(R.id.聊一聊btn);
        m聊一聊btn.setOnClickListener(this);
        m打电话btn = (Button) findViewById(R.id.打电话btn);
        m打电话btn.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.头像img:
                break;
            case R.id.去店铺vs:
                break;
            case R.id.更多vs:
                break;
            case R.id.诚信等级vs:
                break;
            case R.id.加关注tv:
                break;
            case R.id.聊一聊btn:
                break;
            case R.id.打电话btn:
                break;
        }
    }
}
