package com.land.ch.smartnewcountryside.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.activity.WebViewActivity;
import com.land.ch.smartnewcountryside.adapter.MineTypeAdapter;
import com.land.ch.smartnewcountryside.bean.MineTypeBean;
import com.land.ch.smartnewcountryside.view.VSSView;
import com.land.ch.smartnewcountryside.完善名片信息.完善个人信息;
import com.land.ch.smartnewcountryside.全城热恋.全城热恋;
import com.land.ch.smartnewcountryside.帮助中心.意见反馈;
import com.land.ch.smartnewcountryside.我的.图片看病;
import com.land.ch.smartnewcountryside.我的.我的余额;
import com.land.ch.smartnewcountryside.我的.我的动态;
import com.land.ch.smartnewcountryside.我的.我的招聘;
import com.land.ch.smartnewcountryside.我的.我的收藏;
import com.land.ch.smartnewcountryside.我的.我的村庄;
import com.land.ch.smartnewcountryside.我的.我的特权;
import com.land.ch.smartnewcountryside.我的.我的田币;
import com.land.ch.smartnewcountryside.我的.我的订单;
import com.land.ch.smartnewcountryside.我的.我的认证;
import com.land.ch.smartnewcountryside.我的.我的评价;
import com.land.ch.smartnewcountryside.我的.我的通知;
import com.land.ch.smartnewcountryside.我的.支付安全;
import com.land.ch.smartnewcountryside.我的.收货地址;
import com.land.ch.smartnewcountryside.我的.设置;
import com.land.ch.smartnewcountryside.我的.银行账户;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 我的 extends Fragment implements View.OnClickListener {
    private View mView;
    private View view;
    private ImageView 头像;
    private TextView 名字;
    private TextView 手机号;
    private VSSView 我的通知VSSView;
    private VSSView 我的认证VSSView;
    private VSSView 我的动态VSSView;
    private ImageView imgSix;
    private TextView tvSix;
    private AutoLinearLayout 待付款;
    private ImageView imgSeven;
    private TextView tvSeven;
    private AutoLinearLayout 待发货;
    private ImageView imgEight;
    private TextView tvEight;
    private AutoLinearLayout 待收货;
    private ImageView imgNine;
    private TextView tvNine;
    private AutoLinearLayout 待评价;
    private ImageView imgTen;
    private TextView tvTen;
    private AutoLinearLayout 退款;
    private MyGridView 我的分类标签;
    private AutoLinearLayout 常见问题;
    private AutoLinearLayout 意见反馈ll;
    private AutoLinearLayout 关于我们;
    private AutoLinearLayout 客服电话;
    private Button 设置btn;
    private AutoRelativeLayout mMyOrder;
    private List<MineTypeBean> mMineTypeBeans;
    private List<Map<String, Object>> mList;
    private MineTypeAdapter mMineTypeAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_mine, null);
        initView(mView);
        initData();

        return mView;
    }

    private void initView(View mView) {
        头像 = (ImageView) mView.findViewById(R.id.头像);
        头像.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentAty(完善个人信息.class);
            }
        });
        名字 = mView.findViewById(R.id.名字);
        名字.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentAty(完善个人信息.class);
            }
        });
        手机号 = mView.findViewById(R.id.手机号);
        手机号.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentAty(完善个人信息.class);
            }
        });
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
        tvSix = mView.findViewById(R.id.tv_six);
        待付款 = (AutoLinearLayout) mView.findViewById(R.id.待付款);
        待付款.setOnClickListener(this);
        imgSeven = (ImageView) mView.findViewById(R.id.img_seven);
        tvSeven = mView.findViewById(R.id.tv_seven);
        待发货 = (AutoLinearLayout) mView.findViewById(R.id.待发货);
        待发货.setOnClickListener(this);
        imgEight = (ImageView) mView.findViewById(R.id.img_eight);
        tvEight = mView.findViewById(R.id.tv_eight);
        待收货 = (AutoLinearLayout) mView.findViewById(R.id.待收货);
        待收货.setOnClickListener(this);
        imgNine = (ImageView) mView.findViewById(R.id.img_nine);
        tvNine = mView.findViewById(R.id.tv_nine);
        待评价 = (AutoLinearLayout) mView.findViewById(R.id.待评价);
        待评价.setOnClickListener(this);
        imgTen = (ImageView) mView.findViewById(R.id.img_ten);
        tvTen = mView.findViewById(R.id.tv_ten);
        退款 = (AutoLinearLayout) mView.findViewById(R.id.退款);
        退款.setOnClickListener(this);
        我的分类标签 = (MyGridView) mView.findViewById(R.id.我的分类标签);
        常见问题 = (AutoLinearLayout) mView.findViewById(R.id.常见问题);
        常见问题.setOnClickListener(this);
        意见反馈ll = (AutoLinearLayout) mView.findViewById(R.id.意见反馈ll);
        意见反馈ll.setOnClickListener(this);
        关于我们 = (AutoLinearLayout) mView.findViewById(R.id.关于我们);
        关于我们.setOnClickListener(this);
        客服电话 = (AutoLinearLayout) mView.findViewById(R.id.客服电话);
        客服电话.setOnClickListener(this);
        设置btn = (Button) mView.findViewById(R.id.设置btn);
        设置btn.setOnClickListener(this);
        mMyOrder = mView.findViewById(R.id.mine_my_order);
        mMyOrder.setOnClickListener(this);
    }

    private void initData() {
        mList = new ArrayList<>();
        Map<String, Object> map = null;
        for (int i = 0; i < names.length; i++) {
            map = new HashMap<>();
            map.put("name", names[i]);
            map.put("img", imgs[i]);
            mList.add(map);

        }
        mMineTypeAdapter = new MineTypeAdapter(getActivity(), mList);
        我的分类标签.setAdapter(mMineTypeAdapter);
        我的分类标签.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intentAty(我的余额.class);
                        break;
                    case 1:
                        intentAty(我的田币.class);
                        break;
                    case 2:
                        intentAty(我的特权.class);
                        break;
                    case 3:
                        intentAty(我的评价.class);
                        break;
                    case 4:
                        intentAty(银行账户.class);
                        break;
                    case 5:
                        intentAty(支付安全.class);
                        break;
                    case 6:
                        intentAty(我的收藏.class);
                        break;
                    case 7:
                        intentAty(收货地址.class);
                        break;
                    case 8:
                        intentAty(全城热恋.class);
                        break;
                    case 9:
                        intentAty(图片看病.class);
                        break;
                    case 10:
                        intentAty(我的村庄.class);
                        break;
                    case 11:
                        intentAty(我的招聘.class);
                        break;

                }
            }
        });

    }

    private int[] imgs = new int[]{
            R.mipmap.wodeyue,
            R.mipmap.wodetianbi,
            R.mipmap.wodetequan,
            R.mipmap.pingjia,
            R.mipmap.yinhangzhanghu,
            R.mipmap.zhifuanquan,
            R.mipmap.wodeshoucang,
            R.mipmap.shouhuodizhi,
            R.mipmap.qiancheng,
            R.mipmap.kanbing,
            R.mipmap.wodecunzhuang,
            R.mipmap.zhaopinxinxi,
    };

    private String[] names = new String[]{
            "我的余额", "我的田币", "我的特权", "我的评价", "银行账户", "支付安全", "我的收藏", "收货地址", "全城热恋", "图片看病",
            "我的村庄", "招聘信息"};


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.待付款:
                intentAty(我的订单.class);
                break;
            case R.id.待发货:
                intentAty(我的订单.class);
                break;
            case R.id.待收货:
                intentAty(我的订单.class);
                break;
            case R.id.待评价:
                intentAty(我的订单.class);
                break;
            case R.id.退款:
                intentAty(我的订单.class);
                break;
            case R.id.我的分类标签:
                break;
            case R.id.常见问题:
                Intent 常见问题intent = new Intent(getActivity(), WebViewActivity.class);
                常见问题intent.putExtra("titleStr", "常见问题");
                常见问题intent.putExtra("webUrl", "");
                startActivity(常见问题intent);
                break;
            case R.id.意见反馈ll:
                intentAty(意见反馈.class);
                break;
            case R.id.关于我们:
                Intent 关于我们i = new Intent(getActivity(), WebViewActivity.class);
                关于我们i.putExtra("titleStr", "关于我们");
                关于我们i.putExtra("webUrl", "");
                startActivity(关于我们i);
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

    public void intentAty(Class<?> activity) {
        startActivity(new Intent(getActivity(), activity));
    }

}
