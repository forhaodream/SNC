package com.land.ch.smartnewcountryside.我的;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.我的认证.全部;
import com.land.ch.smartnewcountryside.我的认证.已发货;
import com.land.ch.smartnewcountryside.我的认证.待发货;
import com.land.ch.smartnewcountryside.我的认证.待确认;
import com.land.ch.smartnewcountryside.我的认证.待评价;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/20 15:29
 */
public class 我的评价 extends AppCompatActivity {
    private ImageView returnImg;
    private TabLayout tab;
    private ViewPager pager;
    private List<Fragment> mFragmentList;
    private Handler mHandler;
    private String[] titles;
    private MyAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_comment);
        initData();
    }

    public void initData() {
        mFragmentList = new ArrayList<>();
        titles = new String[]{"待评价", "已评价"};
        //页面，数据源
        mFragmentList.add(new 全部());
        mFragmentList.add(new 待确认());
        mFragmentList.add(new 待发货());
        mFragmentList.add(new 已发货());
        mFragmentList.add(new 待评价());
        Intent intent = new Intent("android.intent.action.CART_BROADCAST");
        intent.putExtra("data", "refresh");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        sendBroadcast(intent);
        pager = findViewById(R.id.viewPager);
        tab = findViewById(R.id.tabLayout);
        returnImg = findViewById(R.id.layout_title_back);
        returnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //ViewPager的适配器
        adapter = new MyAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        //绑定
        tab.setupWithViewPager(pager);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        //重写这个方法，将设置每个Tab的标题
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
