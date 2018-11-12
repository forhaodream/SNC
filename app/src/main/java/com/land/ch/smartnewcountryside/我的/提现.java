package com.land.ch.smartnewcountryside.我的;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liquorslib.view.VTextView;
import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/11/12 08:57
 */
public class 提现 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private VTextView m添加VS;
    /**
     * 确定
     */
    private Button m确定btn;


    @Override
    public int initLayout() {
        return R.layout.activity_tixian;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m添加VS =  findViewById(R.id.添加VS);
        m添加VS.setOnClickListener(this);
        m确定btn = (Button) findViewById(R.id.确定btn);
        m确定btn.setOnClickListener(this);
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
            case R.id.添加VS:
                break;
            case R.id.确定btn:
                break;
        }
    }
}
