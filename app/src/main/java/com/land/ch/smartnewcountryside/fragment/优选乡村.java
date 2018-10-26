package com.land.ch.smartnewcountryside.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 优选乡村 extends Fragment implements View.OnClickListener {
    private View mView;
    private View view;
    private AutoRelativeLayout mHomeSearchRl;
    private ImageView m乡村浏览记录;
    private MyGridView m优选乡村分类标签;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_countryside, null);
        initView(mView);
        return mView;
    }

    private void initView(View mView) {
        mHomeSearchRl = (AutoRelativeLayout) mView.findViewById(R.id.home_search_rl);
        mHomeSearchRl.setOnClickListener(this);
        m乡村浏览记录 = (ImageView) mView.findViewById(R.id.乡村浏览记录);
        m优选乡村分类标签 = (MyGridView) mView.findViewById(R.id.优选乡村分类标签);
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.home_search_rl:
                break;
        }
    }
}
