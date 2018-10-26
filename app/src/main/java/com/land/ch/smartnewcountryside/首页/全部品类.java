package com.land.ch.smartnewcountryside.首页;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.bean.AllKindLeftBean;
import com.land.ch.smartnewcountryside.bean.AllKindRightBean;
import com.land.ch.smartnewcountryside.utils.RecyclerAdapter;
import com.land.ch.smartnewcountryside.utils.RecyclerViewHolder;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/26 10:27
 */
public class 全部品类 extends BaseActivity implements View.OnClickListener {
    private ImageView mLayoutTitleBack;
    private TextView mLayoutTitleText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private RecyclerView mKindRv;
    private RecyclerView mFruitRv;
    private List<AllKindLeftBean> mAllKindLeftBeans;
    private List<AllKindRightBean> mAllKindRightBeans;
    private String leftTitle[] = {"农产品", "农资", "农机具", "农业服务", "土地"};
    private String rightTitle[] = {"水果", "蔬菜", "农机具", "农业服务", "土地"
            , "水果", "蔬菜", "农机具", "农业服务", "土地"
    };
    private int rightImg[] = {R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi
            , R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi, R.mipmap.dididi
    };
    private List<Integer> color;
    private List<Boolean> isCheckList;


    @Override
    public int initLayout() {
        return R.layout.activity_all_kinds;
    }

    @Override
    public void initView() {
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(this);
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTitleText.setText("全部品类");
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mKindRv = (RecyclerView) findViewById(R.id.kind_rv);
        mFruitRv = (RecyclerView) findViewById(R.id.fruit_rv);
    }

    @Override
    public void initData() {
        //左-列表
        mAllKindLeftBeans = new ArrayList<>();
        color = new ArrayList<>();
        for (int i = 0; i < leftTitle.length; i++) {
            color.add(R.color.as_color);
        }
        isCheckList = new ArrayList<>();
        for (int i = 0; i < leftTitle.length; i++) {
            isCheckList.add(false);
        }
        for (int i = 0; i < leftTitle.length; i++) {
            mAllKindLeftBeans.add(new AllKindLeftBean(leftTitle[i], color.get(i), isCheckList.get(i)));
        }
        RecyclerAdapter recycleAdapter = new RecyclerAdapter<AllKindLeftBean>(全部品类.this, R.layout.item_kind_big, mAllKindLeftBeans) {
            @Override
            public void convert(RecyclerViewHolder holder, final AllKindLeftBean itemData, final int position) {
                AutoRelativeLayout autoRelativeLayout = holder.getView(R.id.item_big_rlc);
                TextView textView = holder.getView(R.id.item_big_text);
                autoRelativeLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        for (int i = 0; i < isCheckList.size(); i++) {
                            isCheckList.set(i, false);
                        }
                        isCheckList.set(position, true);
                        notifyDataSetChanged();
                    }
                });
                textView.setText(itemData.getTitle());
                autoRelativeLayout.setBackgroundResource(itemData.getColor());
                if (isCheckList.get(position) == true) {
                    autoRelativeLayout.setBackgroundResource(R.color.white);
                } else {
                    autoRelativeLayout.setBackgroundResource(R.color.as_color);
                }
            }
        };
        mKindRv.setLayoutManager(new LinearLayoutManager(全部品类.this));
        mKindRv.setAdapter(recycleAdapter);

        //右-列表
        GridLayoutManager gridLayoutManager = new GridLayoutManager(全部品类.this, 2);
        mFruitRv.setLayoutManager(gridLayoutManager);
        mAllKindRightBeans = new ArrayList<>();
        for (int i = 0; i < rightTitle.length; i++) {
            mAllKindRightBeans.add(new AllKindRightBean(rightImg[i], rightTitle[i]));
        }
        RecyclerAdapter recycleAdapter1 = new RecyclerAdapter<AllKindRightBean>(全部品类.this, R.layout.item_kind_small, mAllKindRightBeans) {
            @Override
            public void convert(RecyclerViewHolder holder, final AllKindRightBean itemData, final int position) {
                AutoRelativeLayout autoRelativeLayout = holder.getView(R.id.item_kind_small_rlc);
                ImageView imageView = holder.getView(R.id.item_small_img);
                TextView textView = holder.getView(R.id.item_small_text);
                autoRelativeLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //startActivity(new Intent(全部品类.this, itemData.getClz()));
                    }
                });
                imageView.setImageResource(itemData.getImg());
                textView.setText(itemData.getTitle());
            }
        };
        mFruitRv.setAdapter(recycleAdapter1);
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
