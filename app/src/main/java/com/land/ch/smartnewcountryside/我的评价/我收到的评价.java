package com.land.ch.smartnewcountryside.我的评价;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.view.MyRatingBar;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/20 16:17
 */
public class 我收到的评价 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private TextView m我收到的评价tv;
    private AutoRelativeLayout mLayoutTitleRlc;
    private MyRatingBar mRatingbar;
    private TextView mCommentNum;
    private TextView mCommentScore;
    private TextView m如何获得;

    @Override
    public int initLayout() {
        return R.layout.activity_woshoudaodepingjia;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        m我收到的评价tv = (TextView) findViewById(R.id.我收到的评价tv);
        m我收到的评价tv.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mRatingbar = (MyRatingBar) findViewById(R.id.ratingbar);
        mRatingbar.setOnClickListener(this);
        mCommentNum = (TextView) findViewById(R.id.comment_num);
        mCommentScore = (TextView) findViewById(R.id.comment_score);
        m如何获得 = (TextView) findViewById(R.id.如何获得);
        m如何获得.setOnClickListener(this);
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
            case R.id.我收到的评价tv:
                break;
            case R.id.ratingbar:
                break;
            case R.id.如何获得:
                break;
        }
    }
}
