package com.wzy.chajiandemo;

import android.app.Application;

import com.wzy.baselib.AppConfig;
import com.wzy.baselib.IService;

public class MyApplication extends Application implements AppConfig {
    @Override
    public void onCreate() {
        super.onCreate();
        for (String app : apps) {
            try {
                Class<?> clazz = Class.forName(app);
                Object instance = clazz.newInstance();
                if (instance instanceof IService) {
                    ((IService) instance).initApp(this);
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
