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
import com.land.ch.smartnewcountryside.activity.KindsActivity;
import com.land.ch.smartnewcountryside.activity.WebViewActivity;
import com.land.ch.smartnewcountryside.bean.HomeTypeBean;
import com.land.ch.smartnewcountryside.utils.RecyclerAdapter;
import com.land.ch.smartnewcountryside.utils.RecyclerViewHolder;
import com.land.ch.smartnewcountryside.view.AutoSwitchView;
import com.land.ch.smartnewcountryside.代养代种.代养代种;
import com.land.ch.smartnewcountryside.优选基地.优选基地;
import com.land.ch.smartnewcountryside.全国行情.全国行情;
import com.land.ch.smartnewcountryside.全城热恋.全城热恋;
import com.land.ch.smartnewcountryside.其它页.优质供应商;
import com.land.ch.smartnewcountryside.发采购.发采购;
import com.land.ch.smartnewcountryside.我的.图片看病;
import com.land.ch.smartnewcountryside.物流叫车.物流叫车;
import com.land.ch.smartnewcountryside.生意圈.生意圈;
import com.land.ch.smartnewcountryside.首页.优质基地;
import com.land.ch.smartnewcountryside.首页.优选乡村;
import com.land.ch.smartnewcountryside.首页.全部品类;
import com.land.ch.smartnewcountryside.首页.农产品;
import com.land.ch.smartnewcountryside.首页.农家院;
import com.land.ch.smartnewcountryside.首页.名优特产;
import com.land.ch.smartnewcountryside.首页.土地流转;
import com.land.ch.smartnewcountryside.首页.小视频;
import com.land.ch.smartnewcountryside.首页.招聘信息;
import com.land.ch.smartnewcountryside.首页.更改位置;
import com.land.ch.smartnewcountryside.首页.直播;
import com.land.ch.smartnewcountryside.首页.直营商城;
import com.land.ch.smartnewcountryside.首页.视频直播;
import com.land.ch.smartnewcountryside.首页.采摘;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;
import java.util.List;

import ch.chtool.view.MyGridView;

/**
 * Created by CH
 * on 2018/10/15 15:04
 */
public class 首页 extends Fragment implements View.OnClickListener {
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
    private ImageView 首页广告三;
    private MyGridView 优选农村;

    private HomeTypeBean mHomeTypeBean;
    private List<HomeTypeBean> mHomeTypes;
    private int typeImg[] = {R.mipmap.ncp, R.mipmap.dydz, R.mipmap.zb, R.mipmap.cz, R.mipmap.njy,
            R.mipmap.jd, R.mipmap.sc, R.mipmap.syq, R.mipmap.xsp, R.mipmap.qw,
            R.mipmap.tdlz, R.mipmap.xc, R.mipmap.jt, R.mipmap.wl, R.mipmap.gg
    };
    private String typeTitle[] = {"农产品", "代养代种", "直播", "采摘", "农家院", "优选基地", "直营商城"
            , "生意圈", "小视频", "全网热恋", "土地流转", "优选乡村", "讲农堂", "物流叫车", "招聘信息"};

    private Class clzList[] = {
            农产品.class, 代养代种.class, 直播.class, 采摘.class, 农家院.class,
            优质基地.class, 直营商城.class, 生意圈.class, 小视频.class, 全城热恋.class,
            土地流转.class, 优选乡村.class, KindsActivity.class, 物流叫车.class, 招聘信息.class
    };
    private int typeLvImg[] = {R.mipmap.sczm, R.mipmap.fl, R.mipmap.nyjx,
            R.mipmap.wsdp, R.mipmap.bh, R.mipmap.sl, R.mipmap.tdlz, R.mipmap.zz, R.mipmap.ny, R.mipmap.qbpl};
    private String typelvTitle[] = {"种苗", "肥料", "农业机械", "大棚设备", "农业备货"
            , "土地流转", "饲料", "种子", "农药", "全部品类"};
    private Class clzlvList[] = {KindsActivity.class, KindsActivity.class, KindsActivity.class, KindsActivity.class, KindsActivity.class
            , KindsActivity.class, KindsActivity.class, KindsActivity.class, KindsActivity.class, 全部品类.class};
    private View view;
    /**
     * 沈阳市
     */
    private TextView mHomeAddressTv;
    private AutoRelativeLayout mHomeSearchRl;
    private ImageView m首页浏览记录;
    private AutoSwitchView mFragmentHomeBanner;
    private RecyclerView m彩色分类;
    private RecyclerView m绿色分类;
    private ImageView m首页广告一;
    private ImageView m首页广告二;
    private ImageView m发采购;
    private ImageView m生意圈;
    private ImageView m图片看病;
    private ImageView m全国行情;
    private ImageView m优选基地;
    private ImageView m视频直播;
    private ImageView m代养代种;
    private ImageView m首页广告三;
    private MyGridView m优选农村;
    private ImageView m优质供应商;
    private ImageView m名优特产;
    private ImageView m首页广告四;
    private RecyclerView m首页商品展示;

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

        mHomeAddressTv = (TextView) mView.findViewById(R.id.home_address_tv);
        mHomeAddressTv.setOnClickListener(this);
        mHomeSearchRl = (AutoRelativeLayout) mView.findViewById(R.id.home_search_rl);
        mHomeSearchRl.setOnClickListener(this);
        m首页浏览记录 = (ImageView) mView.findViewById(R.id.首页浏览记录);
        m首页浏览记录.setOnClickListener(this);
        mFragmentHomeBanner = (AutoSwitchView) mView.findViewById(R.id.fragment_home_banner);
        mFragmentHomeBanner.setOnClickListener(this);
        m彩色分类 = (RecyclerView) mView.findViewById(R.id.彩色分类);
        m彩色分类.setOnClickListener(this);
        m绿色分类 = (RecyclerView) mView.findViewById(R.id.绿色分类);
        m绿色分类.setOnClickListener(this);
        m首页广告一 = (ImageView) mView.findViewById(R.id.首页广告一);
        m首页广告一.setOnClickListener(this);
        m首页广告二 = (ImageView) mView.findViewById(R.id.首页广告二);
        m首页广告二.setOnClickListener(this);
        m发采购 = (ImageView) mView.findViewById(R.id.发采购img);
        m发采购.setOnClickListener(this);
        m生意圈 = (ImageView) mView.findViewById(R.id.生意圈);
        m生意圈.setOnClickListener(this);
        m图片看病 = (ImageView) mView.findViewById(R.id.图片看病);
        m图片看病.setOnClickListener(this);
        m全国行情 = (ImageView) mView.findViewById(R.id.全国行情);
        m全国行情.setOnClickListener(this);
        m优选基地 = (ImageView) mView.findViewById(R.id.优选基地);
        m优选基地.setOnClickListener(this);
        m视频直播 = (ImageView) mView.findViewById(R.id.视频直播);
        m视频直播.setOnClickListener(this);
        m代养代种 = (ImageView) mView.findViewById(R.id.代养代种);
        m代养代种.setOnClickListener(this);
        m首页广告三 = (ImageView) mView.findViewById(R.id.首页广告三);
        m首页广告三.setOnClickListener(this);
        m优选农村 = (MyGridView) mView.findViewById(R.id.优选农村);
        m优质供应商 = (ImageView) mView.findViewById(R.id.优质供应商);
        m优质供应商.setOnClickListener(this);
        m名优特产 = (ImageView) mView.findViewById(R.id.名优特产);
        m名优特产.setOnClickListener(this);
        m首页广告四 = (ImageView) mView.findViewById(R.id.首页广告四);
        m首页广告四.setOnClickListener(this);
        m首页商品展示 = (RecyclerView) mView.findViewById(R.id.首页商品展示);
        m首页商品展示.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_address_tv:
                startActivity(new Intent(getActivity(), 更改位置.class));
                break;
            case R.id.home_search_rl:
                break;
            case R.id.首页浏览记录:
                break;
            case R.id.fragment_home_banner:
                break;
            case R.id.彩色分类:
                break;
            case R.id.绿色分类:
                break;
            case R.id.首页广告一:
                break;
            case R.id.首页广告二:
                Intent intent2 = new Intent(getActivity(), WebViewActivity.class);
                intent2.putExtra("titleStr", "产地产品馆");
                intent2.putExtra("webUrl", "");
                startActivity(intent2);
                break;
            case R.id.发采购img:
                startActivity(new Intent(getActivity(), 发采购.class));
                break;
            case R.id.生意圈:
                startActivity(new Intent(getActivity(), 生意圈.class));
                break;
            case R.id.图片看病:
                startActivity(new Intent(getActivity(), 图片看病.class));
                break;
            case R.id.全国行情:
                startActivity(new Intent(getActivity(), 全国行情.class));
                break;
            case R.id.优选基地:
                startActivity(new Intent(getActivity(), 优选基地.class));
                break;
            case R.id.视频直播:
                startActivity(new Intent(getActivity(), 视频直播.class));
                break;
            case R.id.代养代种:
                startActivity(new Intent(getActivity(), 代养代种.class));
                break;
            case R.id.首页广告三:
                break;
            case R.id.优质供应商:
                startActivity(new Intent(getActivity(), 优质供应商.class));
                break;
            case R.id.名优特产:
                startActivity(new Intent(getActivity(), 名优特产.class));
                break;
            case R.id.首页广告四:
                break;

        }
    }
}
