package com.land.ch.smartnewcountryside.农产品;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/26 15:13
 */
public class 打电话 extends BaseActivity implements View.OnClickListener {

    /**
     * 允许新建/写入联系人
     */
    private Button m允许btn;
    /**
     * 我再想想
     */
    private TextView m我再想想tv;

    @Override
    public int initLayout() {
        return R.layout.activity_dadianhua;
    }

    @Override
    public void initView() {

        m允许btn = (Button) findViewById(R.id.允许btn);
        m允许btn.setOnClickListener(this);
        m我再想想tv = (TextView) findViewById(R.id.我再想想tv);
        m我再想想tv.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.允许btn:
                break;
            case R.id.我再想想tv:
                break;
        }
    }
}
