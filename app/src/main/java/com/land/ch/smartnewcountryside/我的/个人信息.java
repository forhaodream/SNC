package com.land.ch.smartnewcountryside.我的;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liquorslib.view.VPhotoView;
import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 个人信息 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m头像img;
    private AutoRelativeLayout m完善个人信息rlc;

    private TextView m历史记录tv;

    private TextView m关注了我tv;

    private TextView m历史联系tv;
    private ImageView mImage1;
    private AutoRelativeLayout m填写实力rlc;
    private VPhotoView m认证信息VPhotoView;

    private Button m去实名认证btn;


    @Override
    public int initLayout() {
        return R.layout.activity_userinfo;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m头像img = (ImageView) findViewById(R.id.头像img);
        m完善个人信息rlc = (AutoRelativeLayout) findViewById(R.id.完善个人信息rlc);
        m完善个人信息rlc.setOnClickListener(this);
        m历史记录tv = (TextView) findViewById(R.id.历史记录tv);
        m关注了我tv = (TextView) findViewById(R.id.关注了我tv);
        m历史联系tv = (TextView) findViewById(R.id.历史联系tv);
        mImage1 = (ImageView) findViewById(R.id.image1);
        m填写实力rlc = (AutoRelativeLayout) findViewById(R.id.填写实力rlc);
        m认证信息VPhotoView = (VPhotoView) findViewById(R.id.认证信息VPhotoView);
        m认证信息VPhotoView.setOnClickListener(this);
        m去实名认证btn = (Button) findViewById(R.id.去实名认证btn);
        m去实名认证btn.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.layout_title_back:
                break;
            case R.id.layout_title_text:
                break;
            case R.id.完善个人信息rlc:
                break;
            case R.id.认证信息VPhotoView:
                break;
            case R.id.去实名认证btn:
                break;
        }
    }
}
