package com.land.ch.smartnewcountryside.生意圈;

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
import com.land.ch.smartnewcountryside.物流叫车.货源大厅;
import com.land.ch.smartnewcountryside.物流叫车.附近车源;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CH
 * on 2018/10/26 13:38
 */
public class 生意圈 extends AppCompatActivity implements View.OnClickListener {
    private ImageView returnImg;
    private TabLayout tab;
    private ViewPager pager;
    private List<Fragment> mFragmentList;
    private Handler mHandler;
    private String[] titles;
    private MyAdapter adapter;
    private ImageView mHomeAddressTv;
    private AutoRelativeLayout m搜索rlc;
    private ImageView m浏览记录img;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wuliujiaoche);
        initView();
        initData();
    }

    public void initData() {
        mFragmentList = new ArrayList<>();
        titles = new String[]{"货源大厅", "附近车源", "附近车源", "附近车源", "附近车源", "附近车源"};
        //页面，数据源
        mFragmentList.add(new 货源大厅());
        mFragmentList.add(new 附近车源());
        mFragmentList.add(new 附近车源());
        mFragmentList.add(new 附近车源());
        mFragmentList.add(new 附近车源());
        mFragmentList.add(new 附近车源());
        Intent intent = new Intent("android.intent.action.CART_BROADCAST");
        intent.putExtra("data", "refresh");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        sendBroadcast(intent);
        pager = findViewById(R.id.viewPager);
        tab = findViewById(R.id.tabLayout);

        //ViewPager的适配器
        adapter = new MyAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        //绑定
        tab.setupWithViewPager(pager);
    }

    private void initView() {
        mHomeAddressTv = findViewById(R.id.home_address_tv);
        mHomeAddressTv.setOnClickListener(this);
        m搜索rlc = findViewById(R.id.搜索rlc);
        m搜索rlc.setOnClickListener(this);
        m浏览记录img = findViewById(R.id.浏览记录img);
        m浏览记录img.setOnClickListener(this);
        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.viewPager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_address_tv:
                finish();
                break;
            case R.id.搜索rlc:
                break;
            case R.id.浏览记录img:
                break;
        }
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
