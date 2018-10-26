package com.land.ch.smartnewcountryside.我的认证;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/25 13:23
 */
public class 采购认证 extends BaseActivity implements View.OnClickListener {

    private Button m开始认证btn;
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;

    @Override
    public int initLayout() {
        return R.layout.activity_caigourenzheng;
    }

    @Override
    public void initView() {
        m开始认证btn = (Button) findViewById(R.id.开始认证btn);
        m开始认证btn.setOnClickListener(this);
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("采购认证");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.开始认证btn:
                break;
            case R.id.layout_title_back:
                finish();
                break;
        }
    }


}
