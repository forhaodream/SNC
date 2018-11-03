package com.land.ch.smartnewcountryside.我的;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

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
        return R.layout.activity_wodecunzhuang;
    }

    @Override
    public void initView() {

        mLayoutTitleBack = findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("我的村庄");
        mLayoutTitleRlc = findViewById(R.id.layout_title_rlc);
        m省sp = findViewById(R.id.省sp);
        m市sp = findViewById(R.id.市sp);
        m区sp = findViewById(R.id.区sp);
        m乡sp = findViewById(R.id.乡sp);
        m村sp = findViewById(R.id.村sp);
        mRecyclerView = findViewById(R.id.RecyclerView);
        m确定btn = findViewById(R.id.确定btn);
        m确定btn.setOnClickListener(this);
        m添加btn = findViewById(R.id.添加btn);
        m添加btn.setOnClickListener(this);
    }

    @Override
    public void initData() {
        m省sp.setPrompt("省份");
        m市sp.setPrompt("省份");
        m区sp.setPrompt("省份");
        m乡sp.setPrompt("省份");
        m村sp.setPrompt("省份");
        // 声明一个ArrayAdapter用于存放简单数据
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                我的村庄.this, android.R.layout.simple_spinner_item,
                getData());
        // 把定义好的Adapter设定到spinner中
        m省sp.setAdapter(adapter);
        m市sp.setAdapter(adapter);
        m区sp.setAdapter(adapter);
        m乡sp.setAdapter(adapter);
        m村sp.setAdapter(adapter);
        // 为第一个Spinner设定选中事件
        m省sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_title_back:
                finish();
                break;
            case R.id.确定btn:
                break;
            case R.id.添加btn:
                startActivity(添加村庄.class);
                break;
        }
    }

    private List<String> getData() {
        // 数据源
        List<String> dataList = new ArrayList<String>();
        dataList.add("北京");
        dataList.add("上海");
        dataList.add("南京");
        dataList.add("宜昌");
        return dataList;
    }

}