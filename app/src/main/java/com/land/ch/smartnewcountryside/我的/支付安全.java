package com.land.ch.smartnewcountryside.我的;

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
 * on 2018/10/22 09:45
 */
public class 支付安全 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private EditText m支付密码ed;
    private AutoRelativeLayout m身份rlc;
    private EditText m再次支付密码ed;
    private AutoRelativeLayout m主营rlc;
    private Button m确认btn;

    @Override
    public int initLayout() {
        return R.layout.activity_zhifuanquan;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m支付密码ed = (EditText) findViewById(R.id.支付密码ed);
        m身份rlc = (AutoRelativeLayout) findViewById(R.id.身份rlc);
        m再次支付密码ed = (EditText) findViewById(R.id.再次支付密码ed);
        m主营rlc = (AutoRelativeLayout) findViewById(R.id.主营rlc);
        m确认btn = (Button) findViewById(R.id.确认btn);
        m确认btn.setOnClickListener(this);
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
            case R.id.确认btn:
                break;
        }
    }
}