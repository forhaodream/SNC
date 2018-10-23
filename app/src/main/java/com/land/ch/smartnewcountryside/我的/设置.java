package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.utils.MyDataCleanManager;
import com.land.ch.smartnewcountryside.view.VSSView;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/19 16:15
 */
public class 设置 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private AutoRelativeLayout m修改手机号;
    private AutoRelativeLayout m收货地址管理;
    private VSSView m清除缓存;
    private String dataSize = "";
    private Button m退出登录;
    private TextView cleanTv;

    @Override
    public int initLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("设置");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m修改手机号 = findViewById(R.id.修改手机号);
        m修改手机号.setOnClickListener(this);
        m收货地址管理 = findViewById(R.id.收货地址管理);
        m收货地址管理.setOnClickListener(this);
        m退出登录 = (Button) findViewById(R.id.退出登录);
        m退出登录.setOnClickListener(this);
        cleanTv = findViewById(R.id.clean_cache_size);
        cleanTv.setOnClickListener(this);
    }

    @Override
    public void initData() {
        try {
            dataSize = MyDataCleanManager.getTotalCacheSize(设置.this.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        cleanTv.setText(dataSize);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.修改手机号:
                Toast.makeText(this, "修改手机号", Toast.LENGTH_SHORT).show();
                break;
            case R.id.收货地址管理:
                Toast.makeText(this, "收货地址管理", Toast.LENGTH_SHORT).show();
                break;
            case R.id.退出登录:
                break;
            case R.id.clean_cache_size:
                MyDataCleanManager.clearAllCache(设置.this.getApplicationContext());
                cleanTv.setText("0B");
                break;
        }
    }
}
