package com.example.cyt.liveshow.Application;

import android.app.Application;

import com.tencent.ilivesdk.ILiveSDK;
import com.tencent.livesdk.ILVLiveConfig;
import com.tencent.livesdk.ILVLiveManager;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initLiveSdk();
    }

    private void initLiveSdk() {
        //初始化腾讯直播SDK
        //初始化SDK
        ILiveSDK.getInstance().initSdk(getApplicationContext(),1400013700,7285);
        ILVLiveConfig liveConfig = new ILVLiveConfig();
        //初始化直播场景
        ILVLiveManager.getInstance().init(liveConfig);
    }
}
