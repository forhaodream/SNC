package com.land.ch.smartnewcountryside.首页;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.Poi;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;
import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.activity.HomeActivity;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.List;

/**
 * Created by CH
 * on 2018/10/23 13:32
 */
public class 更改位置 extends Activity {
    public LocationClient mLocationClient = null;
    private MyLocationListener mListener = new MyLocationListener();
    private MapView mMapView;
    private BaiduMap mBaiduMap;
    MyLocationConfiguration.LocationMode mLocationMode;
    BitmapDescriptor mCurrentMarker;
    private ImageView mLayoutTitleBack;
    /**
     * 更改位置
     */
    private TextView mLayoutTitleText;
    /**
     * 确定
     */
    private TextView mLayoutTrueText;
    private AutoRelativeLayout mLayoutTitleRlc;
    private MapView mMapview;
    private TextView mAddresstitle;
    LatLng latLng;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_address);
        initView();
    }

    private void initView() {
        mMapView = findViewById(R.id.mapview);
        mBaiduMap = mMapView.getMap();
        mLocationClient = new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(mListener);
        LocationClientOption option = new LocationClientOption();
        option.setScanSpan(1000);
        option.setIsNeedAddress(true);
        option.setOpenGps(true);
        option.setLocationNotify(true);
        option.setIsNeedLocationDescribe(true);
        option.setIsNeedLocationPoiList(true);
        option.setIgnoreKillProcess(false);
        option.SetIgnoreCacheException(false);
        option.setEnableSimulateGps(false);
        mLocationClient.setLocOption(option);
        mLocationClient.start();
        mLayoutTitleBack = (ImageView) findViewById(R.id.layout_title_back);
        mLayoutTitleBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(更改位置.this, HomeActivity.class));
            }
        });
        mLayoutTitleText = (TextView) findViewById(R.id.layout_title_text);
        mLayoutTrueText = (TextView) findViewById(R.id.layout_true_text);
        mLayoutTrueText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(更改位置.this, HomeActivity.class));
            }
        });
        mLayoutTitleRlc = (AutoRelativeLayout) findViewById(R.id.layout_title_rlc);
        mMapview = (MapView) findViewById(R.id.mapview);
        mAddresstitle = findViewById(R.id.address_title);
    }


    public class MyLocationListener extends BDAbstractLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location) {
            //此处的BDLocation为定位结果信息类，通过它的各种get方法可获取定位相关的全部结果
            //以下只列举部分获取地址相关的结果信息
            //更多结果信息获取说明，请参照类参考中BDLocation类中的说明

            String addr = location.getAddrStr();    //获取详细地址信息
            String country = location.getCountry();    //获取国家
            String province = location.getProvince();    //获取省份
            String city = location.getCity();    //获取城市
            String district = location.getDistrict();    //获取区县
            String street = location.getStreet();    //获取街道信息
            String street1 = location.getStreetNumber();    //获取街道信息
            Log.d("地址", addr);
            Log.d("地址", street);
            Log.d("地址", street1);
            mAddresstitle.setText(addr);
            SharedPreferences.Editor userInfo = getSharedPreferences("address_name", MODE_PRIVATE).edit();
            userInfo.putString("address", district);
            userInfo.commit();

            latLng = new LatLng(location.getLatitude(), location.getLongitude());
            // 构造定位数据
            MyLocationData locData = new MyLocationData.Builder()
                    .accuracy(location.getRadius())
                    // 此处设置开发者获取到的方向信息，顺时针0-360
                    .direction(100).latitude(location.getLatitude())
                    .longitude(location.getLongitude()).build();
            // 设置定位数据
            mBaiduMap.setMyLocationEnabled(true);
            mBaiduMap.setMyLocationData(locData);
            LatLng ll = new LatLng(location.getLatitude(),
                    location.getLongitude());
            MapStatus.Builder builder = new MapStatus.Builder();
            builder.target(ll).zoom(18.0f);
            mBaiduMap.animateMapStatus(MapStatusUpdateFactory.newMapStatus(builder.build()));
//            MyLocationData locData = new MyLocationData.Builder()
//                    .accuracy(location.getRadius())
//                    // 此处设置开发者获取到的方向信息，顺时针0-360
//                    .direction(100).latitude(location.getLatitude())
//                    .longitude(location.getLongitude()).build();
            mBaiduMap.setMyLocationData(locData);
            mCurrentMarker = BitmapDescriptorFactory
                    .fromResource(R.mipmap.ic_launcher);
            MyLocationConfiguration config = new MyLocationConfiguration(mLocationMode, true, mCurrentMarker);
            mBaiduMap.setMyLocationConfiguration(config);
            MapStatusUpdate mapStatusUpdate = MapStatusUpdateFactory.newLatLng(latLng);
            mBaiduMap.animateMapStatus(mapStatusUpdate);
        }

    }


}
