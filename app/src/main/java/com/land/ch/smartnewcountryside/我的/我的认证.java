package com.land.ch.smartnewcountryside.我的;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.activity.HomeActivity;
import com.land.ch.smartnewcountryside.bean.HomeTypeBean;
import com.land.ch.smartnewcountryside.bean.认证Bean;
import com.land.ch.smartnewcountryside.utils.RecyclerAdapter;
import com.land.ch.smartnewcountryside.utils.RecyclerViewHolder;
import com.land.ch.smartnewcountryside.我的认证.企业认证;
import com.land.ch.smartnewcountryside.我的认证.实人认证;
import com.land.ch.smartnewcountryside.我的认证.实地认证;
import com.land.ch.smartnewcountryside.我的认证.采购认证;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.base.BaseActivity;
import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/18 15:03
 */
public class 我的认证 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private RecyclerView mRecyclerView;
    private String title[] = {"实人认证", "实地认证", "企业认证", "农资资质", "采购认证"};
    private String include[] = {"人像信息审核", "一亩田员工实地考察认证", "企业资质审核认证", "农资经营资质审核认证", "采购商资质审核认证"};
    private int img[] = {R.mipmap.renrenren, R.mipmap.dididi, R.mipmap.qiqi, R.mipmap.zizi, R.mipmap.caicai};
    private List<认证Bean> m认证Beans;
    private Class clzList[] = {实人认证.class, 实地认证.class, 企业认证.class, HomeActivity.class, 采购认证.class};

    @Override
    public int initLayout() {
        return R.layout.activity_renzheng;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("我的认证");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mRecyclerView = findViewById(R.id.RecyclerView);
    }

    @Override
    public void initData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(我的认证.this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        m认证Beans = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            m认证Beans.add(new 认证Bean(img[i], title[i], include[i], clzList[i]));
        }
        RecyclerAdapter recycleAdapter = new RecyclerAdapter<认证Bean>(我的认证.this, R.layout.item_renzheng, m认证Beans) {
            @Override
            public void convert(RecyclerViewHolder holder, final 认证Bean itemData, final int position) {
                AutoLinearLayout autoLinearLayout = holder.getView(R.id.type_ll);
                ImageView imageView = holder.getView(R.id.image);
                TextView title = holder.getView(R.id.title);
                TextView include = holder.getView(R.id.include);
                autoLinearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(我的认证.this, itemData.getClz()));
                    }
                });
                imageView.setImageResource(itemData.getImg());
                title.setText(itemData.getTitle());
                include.setText(itemData.getInclude());
            }
        };
        mRecyclerView.setAdapter(recycleAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
        }
    }
}
