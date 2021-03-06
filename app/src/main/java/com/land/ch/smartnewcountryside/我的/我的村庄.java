package com.land.ch.smartnewcountryside.我的;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/22 09:46
 */
public class 我的村庄 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private Spinner m省sp;
    private Spinner m市sp;
    private Spinner m区sp;
    private Spinner m乡sp;
    private Spinner m村sp;
    private RecyclerView mRecyclerView;
    private Button m确定btn;
    private Button m添加btn;

    @Override
    public int initLayout() {
        return R.layout.activity_my_countryside;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("我的村庄");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m添加btn = (Button) findViewById(R.id.添加btn);
        m添加btn.setOnClickListener(this);
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
            case R.id.添加btn:
                startActivity(添加村庄.class);
                break;
        }
    }


}