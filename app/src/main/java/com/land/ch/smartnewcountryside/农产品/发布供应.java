package com.land.ch.smartnewcountryside.农产品;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

public class 发布供应 extends AppCompatActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m上传img;
    /**
     * 点击输入: 供应名称, 规格, 吸引人的标题
     */
    private EditText m标题ed;
    /**
     * 点击输入:详细介绍一下你的供应, 包括质量特色和一些服务
     */
    private EditText m说明ed;
    /**
     * 完成
     */
    private Button m完成btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabugongying);
        initView();
    }

    private void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("发布供应");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m上传img = (ImageView) findViewById(R.id.上传img);
        m上传img.setOnClickListener(this);
        m标题ed = (EditText) findViewById(R.id.标题ed);
        m说明ed = (EditText) findViewById(R.id.说明ed);
        m完成btn = (Button) findViewById(R.id.完成btn);
        m完成btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.上传img:
                break;
            case R.id.完成btn:
                break;
        }
    }
}
