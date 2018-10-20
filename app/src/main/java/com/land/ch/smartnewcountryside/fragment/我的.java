package com.land.ch.smartnewcountryside.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.activity.HomeActivity;
import com.land.ch.smartnewcountryside.view.VSSView;
import com.land.ch.smartnewcountryside.我的.我的动态;
import com.land.ch.smartnewcountryside.我的.我的订单;
import com.land.ch.smartnewcountryside.我的.我的认证;
import com.land.ch.smartnewcountryside.我的.我的通知;
import com.land.ch.smartnewcountryside.我的.设置;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 我的 extends Fragment implements View.OnClickListener {
    private View mView;
    private View view;
    private ImageView 头像;
    /**
     * 名字
     */
    private TextView 名字;
    /**
     * 183****6816
     */
    private TextView 手机号;
    private VSSView 我的通知VSSView;
    private VSSView 我的认证VSSView;
    private VSSView 我的动态VSSView;
    private ImageView imgSix;
    /**
     * 待付款
     */
    private TextView tvSix;
    private AutoLinearLayout 待付款;
    private ImageView imgSeven;
    /**
     * 待发货
     */
    private TextView tvSeven;
    private AutoLinearLayout 待发货;
    private ImageView imgEight;
    /**
     * 待收货
     */
    private TextView tvEight;
    private AutoLinearLayout 待收货;
    private ImageView imgNine;
    /**
     * 待评价
     */
    private TextView tvNine;
    private AutoLinearLayout 待评价;
    private ImageView imgTen;
    /**
     * 退款/售后
     */
    private TextView tvTen;
    private AutoLinearLayout 退款;
    private MyGridView 我的分类标签;
    private AutoLinearLayout 常见问题;
    private AutoLinearLayout 意见反馈;
    private AutoLinearLayout 关于我们;
    private AutoLinearLayout 客服电话;
    /**
     * 设置
     */
    private Button 设置btn;
    private AutoRelativeLayout mMyOrder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_mine, null);

        initView(mView);
        return mView;
    }

    private void initView(View mView) {
        头像 = (ImageView) mView.findViewById(R.id.头像);
        名字 = (TextView) mView.findViewById(R.id.名字);
        手机号 = (TextView) mView.findViewById(R.id.手机号);
        我的通知VSSView = (VSSView) mView.findViewById(R.id.我的通知VSSView);
        我的通知VSSView.setOnViewClickListener(new VSSView.OnViewClickListener() {
            @Override
            public void onViewClick() {
                startActivity(new Intent(getActivity(), 我的通知.class));
            }
        });
        我的认证VSSView = (VSSView) mView.findViewById(R.id.我的认证VSSView);
        我的认证VSSView.setOnViewClickListener(new VSSView.OnViewClickListener() {
            @Override
            public void onViewClick() {
                startActivity(new Intent(getActivity(), 我的认证.class));
            }
        });
        我的动态VSSView = (VSSView) mView.findViewById(R.id.我的动态VSSView);
        我的动态VSSView.setOnViewClickListener(new VSSView.OnViewClickListener() {
            @Override
            public void onViewClick() {
                startActivity(new Intent(getActivity(), 我的动态.class));
            }
        });
        imgSix = (ImageView) mView.findViewById(R.id.img_six);
        tvSix = (TextView) mView.findViewById(R.id.tv_six);
        待付款 = (AutoLinearLayout) mView.findViewById(R.id.待付款);
        待付款.setOnClickListener(this);
        imgSeven = (ImageView) mView.findViewById(R.id.img_seven);
        tvSeven = (TextView) mView.findViewById(R.id.tv_seven);
        待发货 = (AutoLinearLayout) mView.findViewById(R.id.待发货);
        待发货.setOnClickListener(this);
        imgEight = (ImageView) mView.findViewById(R.id.img_eight);
        tvEight = (TextView) mView.findViewById(R.id.tv_eight);
        待收货 = (AutoLinearLayout) mView.findViewById(R.id.待收货);
        待收货.setOnClickListener(this);
        imgNine = (ImageView) mView.findViewById(R.id.img_nine);
        tvNine = (TextView) mView.findViewById(R.id.tv_nine);
        待评价 = (AutoLinearLayout) mView.findViewById(R.id.待评价);
        待评价.setOnClickListener(this);
        imgTen = (ImageView) mView.findViewById(R.id.img_ten);
        tvTen = (TextView) mView.findViewById(R.id.tv_ten);
        退款 = (AutoLinearLayout) mView.findViewById(R.id.退款);
        退款.setOnClickListener(this);
        我的分类标签 = (MyGridView) mView.findViewById(R.id.我的分类标签);
        常见问题 = (AutoLinearLayout) mView.findViewById(R.id.常见问题);
        常见问题.setOnClickListener(this);
        意见反馈 = (AutoLinearLayout) mView.findViewById(R.id.意见反馈);
        意见反馈.setOnClickListener(this);
        关于我们 = (AutoLinearLayout) mView.findViewById(R.id.关于我们);
        关于我们.setOnClickListener(this);
        客服电话 = (AutoLinearLayout) mView.findViewById(R.id.客服电话);
        客服电话.setOnClickListener(this);
        设置btn = (Button) mView.findViewById(R.id.设置btn);
        设置btn.setOnClickListener(this);
        mMyOrder = mView.findViewById(R.id.mine_my_order);
        mMyOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.待付款:
                break;
            case R.id.待发货:
                break;
            case R.id.待收货:
                break;
            case R.id.待评价:
                break;
            case R.id.退款:
                break;
            case R.id.我的分类标签:
                break;
            case R.id.常见问题:
                break;
            case R.id.意见反馈:
                break;
            case R.id.关于我们:
                break;
            case R.id.客服电话:
                break;
            case R.id.设置btn:
                startActivity(new Intent(getActivity(), 设置.class));
                break;
            case R.id.mine_my_order:
                startActivity(new Intent(getActivity(), 我的订单.class));
                break;
        }
    }


}
