package com.land.ch.smartnewcountryside.发采购;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.我的特权.已购特权;
import com.land.ch.smartnewcountryside.我的特权.购买记录;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class 发采购 extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnImg;
    private TabLayout tab;
    private ViewPager pager;
    private List<Fragment> mFragmentList;
    private String[] titles;
    //    private MyAdapter adapter;
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facaigou);
        initView();
        initData();
    }

    public void initData() {
//        mFragmentList = new ArrayList<>();
//        titles = new String[]{"已购特权", "购买记录"};
//        //页面，数据源
//        mFragmentList.add(new 已购特权());
//        mFragmentList.add(new 购买记录());
//        Intent intent = new Intent("android.intent.action.CART_BROADCAST");
//        intent.putExtra("data", "refresh");
//        LocalBroadcastManager.getInstance(发采购.this).sendBroadcast(intent);
//        sendBroadcast(intent);
//        pager = findViewById(R.id.viewPager);
//        tab = findViewById(R.id.tabLayout);
//        returnImg = findViewById(R.id.layout_title_back);
//        returnImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//        //ViewPager的适配器
//        adapter = new MyAdapter(getSupportFragmentManager());
//        pager.setAdapter(adapter);
//        //绑定
//        tab.setupWithViewPager(pager);
    }

    private void initView() {
        mLayoutTitleBack = findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("发采购");
        mLayoutTitleRlc = findViewById(R.id.layout_title_rlc);
        mRecyclerView = findViewById(R.id.RecyclerView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
        }
    }

//    class MyAdapter extends FragmentPagerAdapter {
//
//        public MyAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        //重写这个方法，将设置每个Tab的标题
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return titles[position];
//        }
//    }
}
