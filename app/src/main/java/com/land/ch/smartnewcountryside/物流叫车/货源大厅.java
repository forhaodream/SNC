package com.land.ch.smartnewcountryside.物流叫车;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.land.ch.smartnewcountryside.R;

/**
 * Created by CH
 * on 2018/10/16 14:36
 */
public class 货源大厅 extends Fragment {
    private View mView;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_huoyuandating, null);
        initData();
        return mView;
    }

    private void initData() {
        mRecyclerView = mView.findViewById(R.id.RecyclerView);
    }


}
