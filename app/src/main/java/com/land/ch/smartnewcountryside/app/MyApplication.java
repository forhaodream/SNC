package com.land.ch.smartnewcountryside.app;

import android.app.Application;

import com.land.ch.smartnewcountryside.R;
import com.mob.MobSDK;

import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by CH
 * on 2018/10/30 17:37
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }


}
