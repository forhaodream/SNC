package com.land.ch.smartnewcountryside.我的订单;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liquorslib.view.VShowView;
import com.land.ch.smartnewcountryside.R;
import com.makeramen.roundedimageview.RoundedImageView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

public class 订单详情 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private ImageView mRedCha;
    private RoundedImageView m商家头像riv;
    private TextView m商家名称tv;
    private ImageView m聊天img;
    private ImageView m电话img;
    private ImageView mItemOrderHead;
    /**
     * title
     */
    private TextView mItemOrderTitle;
    private ImageView m单价tv;
    /**
     * 产地
     */
    private TextView m产地tv;
    /**
     * 规格
     */
    private TextView m规格tv;
    private TextView mItemOrderGoodsNum;
    private AutoRelativeLayout mItemOrderDetialRl;
    private VShowView m单价vs;
    private VShowView m数量vs;
    private VShowView m贷款vs;
    private VShowView m运杂费vs;
    private VShowView m订单总额vs;
    /**
     * 送货地址
     */
    private TextView mText1;
    /**
     * 送货地址
     */
    private TextView m送货地址tv;
    /**
     * 删除订单
     */
    private Button m删除订单btn;

    @Override
    public int initLayout() {
        return R.layout.activity_order_detail;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mLayoutTitleRlc.setOnClickListener(this);
        mRedCha = (ImageView) findViewById(R.id.red_cha);
        mRedCha.setOnClickListener(this);
        m商家头像riv = (RoundedImageView) findViewById(R.id.商家头像riv);
        m商家头像riv.setOnClickListener(this);
        m商家名称tv = (TextView) findViewById(R.id.商家名称tv);
        m商家名称tv.setOnClickListener(this);
        m聊天img = (ImageView) findViewById(R.id.聊天img);
        m聊天img.setOnClickListener(this);
        m电话img = (ImageView) findViewById(R.id.电话img);
        m电话img.setOnClickListener(this);
        mItemOrderHead = (ImageView) findViewById(R.id.item_order_head);
        mItemOrderHead.setOnClickListener(this);
        mItemOrderTitle = (TextView) findViewById(R.id.item_order_title);
        mItemOrderTitle.setOnClickListener(this);
        m单价tv = (ImageView) findViewById(R.id.单价tv);
        m单价tv.setOnClickListener(this);
        m产地tv = (TextView) findViewById(R.id.产地tv);
        m产地tv.setOnClickListener(this);
        m规格tv = (TextView) findViewById(R.id.规格tv);
        m规格tv.setOnClickListener(this);
        mItemOrderGoodsNum = (TextView) findViewById(R.id.item_order_goods_num);
        mItemOrderGoodsNum.setOnClickListener(this);
        mItemOrderDetialRl = (AutoRelativeLayout) findViewById(R.id.item_order_detial_rl);
        mItemOrderDetialRl.setOnClickListener(this);
        m单价vs = (VShowView) findViewById(R.id.单价vs);
        m单价vs.setOnClickListener(this);
        m数量vs = (VShowView) findViewById(R.id.数量vs);
        m数量vs.setOnClickListener(this);
        m贷款vs = (VShowView) findViewById(R.id.贷款vs);
        m贷款vs.setOnClickListener(this);
        m运杂费vs = (VShowView) findViewById(R.id.运杂费vs);
        m运杂费vs.setOnClickListener(this);
        m订单总额vs = (VShowView) findViewById(R.id.订单总额vs);
        m订单总额vs.setOnClickListener(this);
        mText1 = (TextView) findViewById(R.id.text1);
        mText1.setOnClickListener(this);
        m送货地址tv = (TextView) findViewById(R.id.送货地址tv);
        m送货地址tv.setOnClickListener(this);
        m删除订单btn = (Button) findViewById(R.id.删除订单btn);
        m删除订单btn.setOnClickListener(this);
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
            case R.id.layout_title_rlc:
                break;
            case R.id.red_cha:
                break;
            case R.id.商家头像riv:
                break;
            case R.id.商家名称tv:
                break;
            case R.id.聊天img:
                break;
            case R.id.电话img:
                break;
            case R.id.item_order_head:
                break;
            case R.id.item_order_title:
                break;
            case R.id.单价tv:
                break;
            case R.id.产地tv:
                break;
            case R.id.规格tv:
                break;
            case R.id.item_order_goods_num:
                break;
            case R.id.item_order_detial_rl:
                break;
            case R.id.单价vs:
                break;
            case R.id.数量vs:
                break;
            case R.id.贷款vs:
                break;
            case R.id.运杂费vs:
                break;
            case R.id.订单总额vs:
                break;
            case R.id.text1:
                break;
            case R.id.送货地址tv:
                break;
            case R.id.删除订单btn:
                break;
        }
    }
}
