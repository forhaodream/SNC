package com.land.ch.smartnewcountryside.首页;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;
import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 优选乡村 extends BaseActivity implements View.OnClickListener {
    private View mView;
    private View view;
    private AutoRelativeLayout mHomeSearchRl;
    private ImageView m乡村浏览记录;
    private MyGridView m优选乡村分类标签;
    private RecyclerView mRecyclerView;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_search_rl:
                break;
        }
    }

    @Override
    public int initLayout() {
        return R.layout.fragment_countryside;
    }

    @Override
    public void initView() {

        mHomeSearchRl = (AutoRelativeLayout) findViewById(R.id.home_search_rl);
        m乡村浏览记录 = (ImageView) findViewById(R.id.乡村浏览记录);
        m优选乡村分类标签 = (MyGridView) findViewById(R.id.优选乡村分类标签);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    @Override
    public void initData() {

    }


}
