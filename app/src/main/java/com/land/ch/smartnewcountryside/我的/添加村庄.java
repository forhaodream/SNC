package com.land.ch.smartnewcountryside.我的;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.base.BaseActivity;

public class 添加村庄 extends BaseActivity implements View.OnClickListener {

    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    /**
     * 村庄名称
     */
    private EditText m村庄名称ed;
    /**
     * 村庄介绍
     */
    private EditText m村庄介绍ed;
    /**
     * 确认添加
     */
    private Button m确认添加btn;
    private Spinner m省sp;
    private Spinner m市sp;
    private Spinner m区sp;


    @Override
    public int initLayout() {
        return R.layout.activity_tianjiacunzhuang;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("添加村庄");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        m村庄名称ed = (EditText) findViewById(R.id.村庄名称ed);
        m村庄介绍ed = (EditText) findViewById(R.id.村庄介绍ed);
        m确认添加btn = (Button) findViewById(R.id.确认添加btn);
        m确认添加btn.setOnClickListener(this);
        mLayoutTitleText.setOnClickListener(this);
        mLayoutTitleRlc.setOnClickListener(this);
        m省sp = (Spinner) findViewById(R.id.省sp);
        m市sp = (Spinner) findViewById(R.id.市sp);
        m区sp = (Spinner) findViewById(R.id.区sp);
        m村庄名称ed.setOnClickListener(this);
        m村庄介绍ed.setOnClickListener(this);
    }

    @Override
    public void initData() {
        m省sp.setPrompt("省份");
        m市sp.setPrompt("省份");
        m区sp.setPrompt("省份");
        // 声明一个ArrayAdapter用于存放简单数据
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                添加村庄.this, android.R.layout.simple_spinner_item,
                getData());
        // 把定义好的Adapter设定到spinner中
        m省sp.setAdapter(adapter);
        m市sp.setAdapter(adapter);
        m区sp.setAdapter(adapter);
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
            case R.id.确认添加btn:
                break;
            case R.id.layout_title_text:
                break;
            case R.id.layout_title_rlc:
                break;
            case R.id.村庄名称ed:
                break;
            case R.id.村庄介绍ed:
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
