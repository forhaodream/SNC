package com.land.ch.smartnewcountryside.完善名片信息;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/20 10:45
 */
public class 完善个人信息 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 183*******
     */
    private TextView m手机号tv;
    private AutoRelativeLayout m手机号rlc;
    /**
     * 张三
     */
    private TextView m姓名tv;
    private AutoRelativeLayout m姓名rlc;
    private TextView m身份tv;
    private AutoRelativeLayout m身份rlc;
    /**
     * 请填写主营品类
     */
    private EditText m主营tv;
    private AutoRelativeLayout m主营rlc;
    /**
     * 展示你的实力
     */
    private EditText m实力展示tv;
    private ImageView mTakePhoto;
    private AutoRelativeLayout m选择照片rlc;
    private AutoRelativeLayout m实力展示rlc;
    /**
     * 保  存
     */
    private Button m保存btn;

    @Override
    public int initLayout() {
        return R.layout.activity_wanshangerenxinxi;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("完善个人信息");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m手机号tv = (TextView) findViewById(R.id.手机号tv);
        m手机号rlc = (AutoRelativeLayout) findViewById(R.id.手机号rlc);
        m手机号rlc.setOnClickListener(this);
        m姓名tv = (TextView) findViewById(R.id.姓名tv);
        m姓名rlc = (AutoRelativeLayout) findViewById(R.id.姓名rlc);
        m姓名rlc.setOnClickListener(this);
        m身份tv = (TextView) findViewById(R.id.身份tv);
        m身份rlc = (AutoRelativeLayout) findViewById(R.id.身份rlc);
        m身份rlc.setOnClickListener(this);
        m主营tv = (EditText) findViewById(R.id.主营tv);
        m主营rlc = (AutoRelativeLayout) findViewById(R.id.主营rlc);
        m实力展示tv = (EditText) findViewById(R.id.实力展示tv);
        mTakePhoto = (ImageView) findViewById(R.id.take_photo);
        m选择照片rlc = (AutoRelativeLayout) findViewById(R.id.选择照片rlc);
        m选择照片rlc.setOnClickListener(this);
        m实力展示rlc = (AutoRelativeLayout) findViewById(R.id.实力展示rlc);
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
            case R.id.手机号rlc:
                break;
            case R.id.姓名rlc:
                break;
            case R.id.身份rlc:
                break;
            case R.id.选择照片rlc:
                break;
            case R.id.保存btn:
                break;
        }
    }
}
