package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 经办人 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 点击获取所在地区
     */
    private EditText m所在地区ed;
    private EditText m详细地址ed;
    private EditText m联系人ed;
    /**
     * 点击输入品类
     */
    private EditText m主营品种ed;
    private EditText m从业年限ed;
    private EditText m代办费用ed;
    /**
     * 保存
     */
    private Button m保存btn;


    @Override
    public int initLayout() {
        return R.layout.activity_jingbanren;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("经纪人/代办");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m所在地区ed = (EditText) findViewById(R.id.所在地区ed);
        m详细地址ed = (EditText) findViewById(R.id.详细地址ed);
        m联系人ed = (EditText) findViewById(R.id.联系人ed);
        m主营品种ed = (EditText) findViewById(R.id.主营品种ed);
        m从业年限ed = (EditText) findViewById(R.id.从业年限ed);
        m代办费用ed = (EditText) findViewById(R.id.代办费用ed);
        m保存btn = (Button) findViewById(R.id.保存btn);
        m保存btn.setOnClickListener(this);
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
            case R.id.保存btn:
                break;
        }
    }
}
