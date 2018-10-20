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
import android.widget.TextView;

import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.bean.HomeTypeBean;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
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
    private View view;
    /**
     * 沈阳市
     */
    private TextView homeAddressTv;
    private AutoRelativeLayout homeSearchRl;
    private ImageView 首页浏览记录;
    private AutoSwitchView fragmentHomeBanner;
    private MyGridView 彩色分类;
    private MyGridView 绿色分类;
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
//            R.mipmap.jd, R.mipmap.sc, R.mipmap.syq, R.mipmap.xsp, R.mipmap.qw,
//            R.mipmap.tdlz, R.mipmap.xc, R.mipmap.jt, R.mipmap.wl, R.mipmap.gg
    };
    private String typeTitle[] = {"农产品", "代养代种", "直播", "采摘", "农家院"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, null);
        initView(mView);
        return mView;
    }

    private void initView(View mView) {
        homeAddressTv = (TextView) mView.findViewById(R.id.home_address_tv);
        homeSearchRl = (AutoRelativeLayout) mView.findViewById(R.id.home_search_rl);
        首页浏览记录 = (ImageView) mView.findViewById(R.id.首页浏览记录);
        fragmentHomeBanner = (AutoSwitchView) mView.findViewById(R.id.fragment_home_banner);
        彩色分类 = (MyGridView) mView.findViewById(R.id.彩色分类);
        绿色分类 = (MyGridView) mView.findViewById(R.id.绿色分类);
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
        mHomeTypes = new ArrayList<>();
        for (int i = 0; i < typeTitle.length; i++) {
            mHomeTypeBean = new HomeTypeBean();
            mHomeTypeBean.setImg(typeImg[i]);
            mHomeTypeBean.setTitle(typeTitle[i]);
            mHomeTypes.add(mHomeTypeBean);
        }

    }
}
