package com.land.ch.smartnewcountryside.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.activity.HomeActivity;
import com.land.ch.smartnewcountryside.bean.HomeTypeBean;
import com.land.ch.smartnewcountryside.utils.RecyclerAdapter;
import com.land.ch.smartnewcountryside.utils.RecyclerViewHolder;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.land.ch.smartnewcountryside.招聘信息.招聘信息;
import com.land.ch.smartnewcountryside.首页.全部品类;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 首页 extends Fragment {
    private View mView;
    /**
     * 沈阳市
     */
    private TextView homeAddressTv;
    private AutoRelativeLayout homeSearchRl;
    private ImageView 首页浏览记录;
    private AutoSwitchView fragmentHomeBanner;
    private RecyclerView 彩色分类;
    private RecyclerView 绿色分类;
    private ImageView 首页广告一;
    private ImageView 首页广告二;
    private ImageView 发采购;
    private ImageView 生意圈;
    private ImageView 图片看病;
    private ImageView 全国行情;
    private ImageView 优选基地;
    private ImageView 视频直播;
    private ImageView 代养代种;
    private ImageView 首页广告三;
    private MyGridView 优选农村;
    private ImageView 优质供应商;
    private ImageView 名优特产;
    private ImageView 首页广告四;
    private RecyclerView 首页商品展示;
    private HomeTypeBean mHomeTypeBean;
    private List<HomeTypeBean> mHomeTypes;
    private int typeImg[] = {R.mipmap.ncp, R.mipmap.dydz, R.mipmap.zb, R.mipmap.cz, R.mipmap.njy,
            R.mipmap.jd, R.mipmap.sc, R.mipmap.syq, R.mipmap.xsp, R.mipmap.qw,
            R.mipmap.tdlz, R.mipmap.xc, R.mipmap.jt, R.mipmap.wl, R.mipmap.gg
    };
    private String typeTitle[] = {"农产品", "代养代种", "直播", "采摘", "农家院", "优选基地", "直营商城"
            , "生意圈", "小视频", "全网热恋", "土地流转", "优选乡村", "讲农堂", "物流叫车", "招聘信息"};

    private Class clzList[] = {
            HomeActivity.class, HomeActivity.class, HomeActivity.class, HomeActivity.class, HomeActivity.class
            , HomeActivity.class, HomeActivity.class, HomeActivity.class, HomeActivity.class, HomeActivity.class
            , HomeActivity.class, HomeActivity.class, HomeActivity.class, HomeActivity.class, 招聘信息.class
    };
    private int typeLvImg[] = {R.mipmap.sczm, R.mipmap.fl, R.mipmap.nyjx,
            R.mipmap.wsdp, R.mipmap.bh, R.mipmap.sl, R.mipmap.tdlz, R.mipmap.zz, R.mipmap.ny, R.mipmap.qbpl};
    private String typelvTitle[] = {"种苗", "肥料", "农业机械", "大棚设备", "农业备货"
            , "土地流转", "饲料", "种子", "农药", "全部品类"};
    private Class clzlvList[] = {全部品类.class, 全部品类.class, 全部品类.class, 全部品类.class, 全部品类.class
            , 全部品类.class, 全部品类.class, 全部品类.class, 全部品类.class, 全部品类.class};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, null);
        initView(mView);
        initRecyclerView();
        return mView;
    }

    private void initView(View mView) {
        homeAddressTv = (TextView) mView.findViewById(R.id.home_address_tv);
        homeSearchRl = (AutoRelativeLayout) mView.findViewById(R.id.home_search_rl);
        首页浏览记录 = (ImageView) mView.findViewById(R.id.首页浏览记录);
        fragmentHomeBanner = (AutoSwitchView) mView.findViewById(R.id.fragment_home_banner);
        彩色分类 = mView.findViewById(R.id.彩色分类);
        绿色分类 = mView.findViewById(R.id.绿色分类);
        首页广告一 = (ImageView) mView.findViewById(R.id.首页广告一);
        首页广告二 = (ImageView) mView.findViewById(R.id.首页广告二);
        发采购 = (ImageView) mView.findViewById(R.id.发采购);
        生意圈 = (ImageView) mView.findViewById(R.id.生意圈);
        图片看病 = (ImageView) mView.findViewById(R.id.图片看病);
        全国行情 = (ImageView) mView.findViewById(R.id.全国行情);
        优选基地 = (ImageView) mView.findViewById(R.id.优选基地);
        视频直播 = (ImageView) mView.findViewById(R.id.视频直播);
        代养代种 = (ImageView) mView.findViewById(R.id.代养代种);
        首页广告三 = (ImageView) mView.findViewById(R.id.首页广告三);
        优选农村 = (MyGridView) mView.findViewById(R.id.优选农村);
        优质供应商 = (ImageView) mView.findViewById(R.id.优质供应商);
        名优特产 = (ImageView) mView.findViewById(R.id.名优特产);
        首页广告四 = (ImageView) mView.findViewById(R.id.首页广告四);
        首页商品展示 = (RecyclerView) mView.findViewById(R.id.首页商品展示);
    }

    private void initData() {


    }

    private void initRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 5);
        彩色分类.setLayoutManager(gridLayoutManager);
        mHomeTypes = new ArrayList<>();
        for (int i = 0; i < typeImg.length; i++) {
            mHomeTypes.add(new HomeTypeBean(typeTitle[i], typeImg[i], clzList[i]));
        }
        RecyclerAdapter recycleAdapter = new RecyclerAdapter<HomeTypeBean>(getActivity(), R.layout.item_home_type, mHomeTypes) {
            @Override
            public void convert(RecyclerViewHolder holder, final HomeTypeBean itemData, final int position) {
                AutoLinearLayout autoLinearLayout = holder.getView(R.id.type_ll);
                ImageView imageView = holder.getView(R.id.item_mine_type_img);
                TextView textView = holder.getView(R.id.item_mine_type_text);
                autoLinearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), itemData.getClz()));
                    }
                });
                imageView.setImageResource(itemData.getImg());
                textView.setText(itemData.getTitle());
            }
        };
        彩色分类.setAdapter(recycleAdapter);

        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getActivity(), 5);
        绿色分类.setLayoutManager(gridLayoutManager1);
        mHomeTypes = new ArrayList<>();
        for (int i = 0; i < typelvTitle.length; i++) {
            mHomeTypes.add(new HomeTypeBean(typelvTitle[i], typeLvImg[i], clzlvList[i]));
        }
        RecyclerAdapter recycleAdapter1 = new RecyclerAdapter<HomeTypeBean>(getActivity(), R.layout.item_home_type, mHomeTypes) {
            @Override
            public void convert(RecyclerViewHolder holder, final HomeTypeBean itemData, final int position) {
                AutoLinearLayout autoLinearLayout = holder.getView(R.id.type_ll);
                ImageView imageView = holder.getView(R.id.item_mine_type_img);
                TextView textView = holder.getView(R.id.item_mine_type_text);
                autoLinearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), itemData.getClz()));
                    }
                });
                imageView.setImageResource(itemData.getImg());
                textView.setText(itemData.getTitle());
            }
        };
        绿色分类.setAdapter(recycleAdapter1);

    }
}
