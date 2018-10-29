package com.land.ch.smartnewcountryside.优选基地;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/29 11:18
 */
public class 优选基地 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private WebView m优选基地web;
    private AutoLinearLayout m叫物流rlc;
    private AutoLinearLayout m立即买rlc;
    /**
     * 成为优选
     */
    private Button m成为优选btn;
    /**
     * 打电话
     */
    private Button m打电话btn;

    @Override
    public int initLayout() {
        return R.layout.activity_youxuanjidi;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("优选基地");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m优选基地web = (WebView) findViewById(R.id.优选基地web);
        m叫物流rlc = (AutoLinearLayout) findViewById(R.id.叫物流rlc);
        m叫物流rlc.setOnClickListener(this);
        m立即买rlc = (AutoLinearLayout) findViewById(R.id.立即买rlc);
        m立即买rlc.setOnClickListener(this);
        m成为优选btn = (Button) findViewById(R.id.成为优选btn);
        m成为优选btn.setOnClickListener(this);
        m打电话btn = (Button) findViewById(R.id.打电话btn);
        m打电话btn.setOnClickListener(this);
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
            case R.id.叫物流rlc:
                break;
            case R.id.立即买rlc:
                break;
            case R.id.成为优选btn:
                break;
            case R.id.打电话btn:
                break;
        }
    }
}
