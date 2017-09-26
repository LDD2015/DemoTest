package com.liuxj.user;

import android.app.Application;

import com.liuxj.user.mvvm.inject.ApplicationComponent;
import com.liuxj.user.mvvm.inject.module.ApplicationModule;

/**
 * Created by LiuXJ on 2017/9/26.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent.Instance.init(DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build());
    }
}
