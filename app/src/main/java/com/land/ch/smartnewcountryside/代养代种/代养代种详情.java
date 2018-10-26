package com.land.ch.smartnewcountryside.代养代种;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/26 15:57
 */
public class 代养代种详情 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private AutoSwitchView mFragmentHomeBanner;
    /**
     * 75元/斤
     */
    private TextView m价格tv;
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
    private ImageView m视频view;

    @Override
    public int initLayout() {
        return R.layout.activity_daiyangdaizhongxiangqing;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mFragmentHomeBanner = (AutoSwitchView) findViewById(R.id.fragment_home_banner);
        m价格tv = (TextView) findViewById(R.id.价格tv);
        mCsTitle = (TextView) findViewById(R.id.cs_title);
        mCsJuli = (TextView) findViewById(R.id.cs_juli);
        mCsRenshu = (TextView) findViewById(R.id.cs_renshu);
        m视频view = (ImageView) findViewById(R.id.视频view);
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
