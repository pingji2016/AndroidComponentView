package com.example.common;

import android.app.Application;
import android.util.Log;

import com.example.common.config.BaseConfig;

public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(BaseConfig.TAG, "BaseApplication:onCreate: ");

//        EventBus.getDefault().post(new MessageWrap());
    }

}
