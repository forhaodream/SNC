package com.land.ch.smartnewcountryside.我的订单;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.land.ch.smartnewcountryside.R;

/**
 * Created by CH
 * on 2018/10/20 15:43
 */
public class 全部 extends Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_all_order, null);
        return mView;
    }
}
