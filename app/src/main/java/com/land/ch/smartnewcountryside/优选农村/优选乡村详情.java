package com.land.ch.smartnewcountryside.优选农村;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.nex3z.flowlayout.FlowLayout;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 10:46
 */
public class 优选乡村详情 extends BaseActivity implements View.OnClickListener {
    private ImageView mCsdBack;
    private ImageView mCsdShare;
    private ImageView mCsdMore;
    private ImageView mDetailImg;
    /**
     * 优质村庄
     */
    private TextView mCsTitle;
    /**
     * 距离1659公里
     */
    private TextView mCsJuli;
    /**
     * 10000人加入
     */
    private TextView mCsRenshu;
    private ImageView m安全img;
    private ImageView m头像img;
    /**
     * 田庆玲
     */
    private TextView m姓名tv;
    /**
     * 合作社 持续经营536天
     */
    private TextView mInclude;
    private AutoRelativeLayout m信息rlc;
    /**
     * 诚信等级: 6级
     */
    private TextView m诚信等级tv;
    /**
     * 诚信等级: 6级
     */
    private TextView m评价tv;
    /**
     * 评价 (100)
     */
    private TextView m评价数量tv;
    private FlowLayout mFlow;
    private AutoLinearLayout mAutoImgLinear;
    /**
     * 发布时间: 08月28日
     */
    private TextView m发布时间tv;
    private AutoLinearLayout m叫物流rlc;
    private AutoLinearLayout m立即买rlc;
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
        return R.layout.activity_countryside_detail;
    }

    @Override
    public void initView() {

        mCsdBack = (ImageView) findViewById(R.id.csd_back);
        mCsdBack.setOnClickListener(this);
        mCsdShare = (ImageView) findViewById(R.id.csd_share);
        mCsdShare.setOnClickListener(this);
        mCsdMore = (ImageView) findViewById(R.id.csd_more);
        mCsdMore.setOnClickListener(this);
        mDetailImg = (ImageView) findViewById(R.id.detail_img);
        mCsTitle = (TextView) findViewById(R.id.cs_title);
        mCsJuli = (TextView) findViewById(R.id.cs_juli);
        mCsRenshu = (TextView) findViewById(R.id.cs_renshu);
        m安全img = (ImageView) findViewById(R.id.安全img);
        m安全img.setOnClickListener(this);
        m头像img = (ImageView) findViewById(R.id.头像img);
        m头像img.setOnClickListener(this);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        mInclude = (TextView) findViewById(R.id.include);
        m信息rlc = (AutoRelativeLayout) findViewById(R.id.信息rlc);
        m信息rlc.setOnClickListener(this);
        m诚信等级tv = (TextView) findViewById(R.id.诚信等级tv);
        m诚信等级tv.setOnClickListener(this);
        m评价tv = (TextView) findViewById(R.id.评价tv);
        m评价tv.setOnClickListener(this);
        m评价数量tv = (TextView) findViewById(R.id.评价数量tv);
        m评价数量tv.setOnClickListener(this);
        mFlow = (FlowLayout) findViewById(R.id.flow);
        mAutoImgLinear = (AutoLinearLayout) findViewById(R.id.auto_img_linear);
        m发布时间tv = (TextView) findViewById(R.id.发布时间tv);
        m叫物流rlc = (AutoLinearLayout) findViewById(R.id.叫物流rlc);
        m叫物流rlc.setOnClickListener(this);
        m立即买rlc = (AutoLinearLayout) findViewById(R.id.立即买rlc);
        m立即买rlc.setOnClickListener(this);
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
            default:
                break;
            case R.id.csd_back:
                break;
            case R.id.csd_share:
                break;
            case R.id.csd_more:
                break;
            case R.id.安全img:
                break;
            case R.id.头像img:
                break;
            case R.id.信息rlc:
                break;
            case R.id.诚信等级tv:
                break;
            case R.id.评价tv:
                break;
            case R.id.评价数量tv:
                break;
            case R.id.叫物流rlc:
                break;
            case R.id.立即买rlc:
                break;
            case R.id.聊一聊btn:
                break;
            case R.id.人气btn:
                break;
        }
    }
}
