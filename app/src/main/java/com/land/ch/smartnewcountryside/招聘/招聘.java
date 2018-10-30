package com.land.ch.smartnewcountryside.招聘;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.AutoRelativeLayout;

/**
 * Created by CH
 * on 2018/10/30 09:49
 */
public class 招聘 extends Fragment implements View.OnClickListener {
    private View mView;
    private View view;
    private RecyclerView mRecyclerView;
    private AutoRelativeLayout m发布货源rlc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_zhaopin, null);
        initView(mView);
        return mView;
    }


    private void initView(View mView) {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.RecyclerView);
        m发布货源rlc = (AutoRelativeLayout) mView.findViewById(R.id.发布货源rlc);
        m发布货源rlc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.发布货源rlc:
                startActivity(new Intent(getActivity(), 发布招聘.class));
                break;
        }
    }
}
