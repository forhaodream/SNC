package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.land.ch.smartnewcountryside.R;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 09:45
 */

public class 银行账户 extends BaseActivity {
    private RecyclerView mRecyclerView;

    @Override
    public int initLayout() {
        return R.layout.activity_yinhangzhanghu;
    }

    @Override
    public void initView() {
        mRecyclerView = findViewById(R.id.RecyclerView);
    }

    @Override
    public void initData() {

    }

}
