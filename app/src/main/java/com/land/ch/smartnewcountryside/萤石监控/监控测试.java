package com.land.ch.smartnewcountryside.萤石监控;

import android.os.Bundle;

import com.ezvizuikit.open.EZUIError;
import com.ezvizuikit.open.EZUIKit;
import com.ezvizuikit.open.EZUIPlayer;
import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.app.MyApplication;

import java.util.Calendar;

import ch.chtool.base.BaseActivity;

/**
 * Created by CH
 * on 2018/10/30 17:33
 */
public class 监控测试 extends BaseActivity {
    private EZUIPlayer mPlayerUi;
    private MyApplication application;

    @Override
    public int initLayout() {
        //初始化EZUIKit
        EZUIKit.initWithAppKey(application, "2220c4c61d1642d4a0193872eb6920bd");

//设置授权token
        EZUIKit.setAccessToken("at.4orsleng4sljbfxz6w16cxmxc6dp16v7-2vccba3ej2-12ui9ji-r7g0ev6cj");


        //设置播放回调callback
        mPlayerUi.setCallBack(new EZUIPlayer.EZUIPlayerCallBack() {
            @Override
            public void onPlaySuccess() {

            }

            @Override
            public void onPlayFail(EZUIError ezuiError) {

            }

            @Override
            public void onVideoSizeChange(int i, int i1) {

            }

            @Override
            public void onPrepared() {

            }

            @Override
            public void onPlayTime(Calendar calendar) {

            }

            @Override
            public void onPlayFinish() {

            }
        });

        //设置播放参数
        mPlayerUi.setUrl("");

        //开始播放
        mPlayerUi.startPlay();


        return R.layout.activity_yingshijiankong;
    }

    @Override
    public void initView() {

        mPlayerUi = findViewById(R.id.player_ui);
    }

    @Override
    public void initData() {

    }

    @Override
    protected void onStop() {
        super.onStop();

        //停止播放
        mPlayerUi.stopPlay();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //释放资源
        mPlayerUi.releasePlayer();
    }
}
