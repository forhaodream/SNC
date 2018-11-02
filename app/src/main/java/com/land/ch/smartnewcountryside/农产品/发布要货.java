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

import ch.chtool.base.BaseActivity;

public class 发布要货 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private TextView m产品图片img;
    private AutoRelativeLayout m产品图片rlc;
    private TextView m要货数量tv;
    private AutoRelativeLayout m要货数量rlc;
    private TextView m指定产地tv;
    private AutoRelativeLayout m指定产地rlc;
    private EditText m品质要求tv;
    private AutoRelativeLayout m品质要求rlc;
    /**
     * 全国
     */
    private EditText m要货时间tv;
    private AutoRelativeLayout m要货时间rlc;
    /**
     * 心里定价
     */
    private EditText m心里定价1tv;
    /**
     * ～
     */
    private TextView mTv1;
    /**
     * 心里定价
     */
    private EditText m心里定价2tv;
    private AutoRelativeLayout m心里定价rlc;
    /**
     * 确定发布
     */
    private Button m保存btn;


    @Override
    public int initLayout() {
        return R.layout.activity_fabuyaohuo;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m产品图片img = (TextView) findViewById(R.id.产品图片img);
        m产品图片rlc = (AutoRelativeLayout) findViewById(R.id.产品图片rlc);
        m要货数量tv = (TextView) findViewById(R.id.要货数量tv);
        m要货数量rlc = (AutoRelativeLayout) findViewById(R.id.要货数量rlc);
        m指定产地tv = (TextView) findViewById(R.id.指定产地tv);
        m指定产地rlc = (AutoRelativeLayout) findViewById(R.id.指定产地rlc);
        m品质要求tv = (EditText) findViewById(R.id.品质要求tv);
        m品质要求rlc = (AutoRelativeLayout) findViewById(R.id.品质要求rlc);
        m要货时间tv = (EditText) findViewById(R.id.要货时间tv);
        m要货时间rlc = (AutoRelativeLayout) findViewById(R.id.要货时间rlc);
        m心里定价1tv = (EditText) findViewById(R.id.心里定价1tv);
        mTv1 = (TextView) findViewById(R.id.tv1);
        m心里定价2tv = (EditText) findViewById(R.id.心里定价2tv);
        m心里定价rlc = (AutoRelativeLayout) findViewById(R.id.心里定价rlc);
        m保存btn = (Button) findViewById(R.id.保存btn);
        m保存btn.setOnClickListener(this);
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
            case R.id.保存btn:
                break;
        }
    }
}
