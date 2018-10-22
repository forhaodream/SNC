package com.land.ch.smartnewcountryside.我的;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 09:46
 */
public class 图片看病 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private TextView mLayoutTitleName;
    private AutoRelativeLayout mLayoutTitleRlc, 发布Rlc;
    private RecyclerView recyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_tupiankanbing;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleName = (TextView) findViewById(R.id.layout_title_name);
        mLayoutTitleName.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        recyclerView =  findViewById(R.id.recyclerView);
        发布Rlc = findViewById(R.id.发布rlc);
        发布Rlc.setOnClickListener(this);
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
            case R.id.layout_title_name:
                startActivity(new Intent(图片看病.this, 我的图片看病.class));
                break;
            case R.id.发布rlc:
                break;
        }
    }
}