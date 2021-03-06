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

public class 农产品要货详情 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView m产品图片img;
    private AutoRelativeLayout m产品图片rlc;
    /**
     * 中国辽宁省沈阳
     */
    private TextView m要货编号tv;
    private AutoRelativeLayout m要货编号rlc;
    private TextView m要货品种tv;
    private AutoRelativeLayout m要货品种rlc;
    private EditText m要货数量tv;
    private AutoRelativeLayout m要货数量rlc;
    /**
     * 全国
     */
    private EditText m指定产地tv;
    private AutoRelativeLayout m指定产地rlc;
    /**
     * 品质要求
     */
    private EditText m品质要求tv;
    private AutoRelativeLayout m品质要求rlc;
    /**
     * 要货时间
     */
    private EditText m要货时间tv;
    private AutoRelativeLayout m要货时间rlc;
    /**
     * 心里定价
     */
    private EditText m心里定价tv;
    private AutoRelativeLayout m心里定价rlc;
    /**
     * 结束报价
     */
    private Button m保存btn;


    @Override
    public int initLayout() {
        return R.layout.activity_ncpyhxq;
    }

    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m产品图片img = (ImageView) findViewById(R.id.产品图片img);
        m产品图片rlc = (AutoRelativeLayout) findViewById(R.id.产品图片rlc);
        m要货编号tv = (TextView) findViewById(R.id.要货编号tv);
        m要货编号rlc = (AutoRelativeLayout) findViewById(R.id.要货编号rlc);
        m要货品种tv = (TextView) findViewById(R.id.要货品种tv);
        m要货品种rlc = (AutoRelativeLayout) findViewById(R.id.要货品种rlc);
        m要货数量tv = (EditText) findViewById(R.id.要货数量tv);
        m要货数量rlc = (AutoRelativeLayout) findViewById(R.id.要货数量rlc);
        m指定产地tv = (EditText) findViewById(R.id.指定产地tv);
        m指定产地rlc = (AutoRelativeLayout) findViewById(R.id.指定产地rlc);
        m品质要求tv = (EditText) findViewById(R.id.品质要求tv);
        m品质要求rlc = (AutoRelativeLayout) findViewById(R.id.品质要求rlc);
        m要货时间tv = (EditText) findViewById(R.id.要货时间tv);
        m要货时间rlc = (AutoRelativeLayout) findViewById(R.id.要货时间rlc);
        m心里定价tv = (EditText) findViewById(R.id.心里定价tv);
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
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.保存btn:
                break;
        }
    }
}
