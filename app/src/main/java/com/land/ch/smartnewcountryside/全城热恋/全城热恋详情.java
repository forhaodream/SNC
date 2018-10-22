package com.land.ch.smartnewcountryside.全城热恋;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 14:11
 */
public class 全城热恋详情 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m展示img;
    /**
     * 谷歌
     */
    private TextView m姓名tv;
    /**
     * 谷歌
     */
    private TextView m手机号tv;
    /**
     * 年龄
     */
    private TextView m年龄tv;
    /**
     * 现居地
     */
    private TextView m现居地tv;
    /**
     * 性别
     */
    private TextView m性别tv;
    /**
     * 爱好
     */
    private TextView m爱好tv;
    /**
     * 简介:
     */
    private TextView m简介tv;
    private ImageView mDetailImgOne;
    private ImageView mDetailImgTwo;
    /**
     * 关注一波
     */
    private Button m关注一波btn;
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
        return R.layout.activity_quanwangrelianxiangqing;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m展示img = (ImageView) findViewById(R.id.展示img);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m手机号tv = (TextView) findViewById(R.id.手机号tv);
        m年龄tv = (TextView) findViewById(R.id.年龄tv);
        m现居地tv = (TextView) findViewById(R.id.现居地tv);
        m性别tv = (TextView) findViewById(R.id.性别tv);
        m爱好tv = (TextView) findViewById(R.id.爱好tv);
        m简介tv = (TextView) findViewById(R.id.简介tv);
        mDetailImgOne = (ImageView) findViewById(R.id.detail_img_one);
        mDetailImgTwo = (ImageView) findViewById(R.id.detail_img_two);
        m关注一波btn = (Button) findViewById(R.id.关注一波btn);
        m关注一波btn.setOnClickListener(this);
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
            case R.id.关注一波btn:
                break;
            case R.id.聊一聊btn:
                break;
            case R.id.人气btn:
                break;
        }
    }
}
