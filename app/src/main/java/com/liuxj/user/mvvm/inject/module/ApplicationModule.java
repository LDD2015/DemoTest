package com.liuxj.user.mvvm.inject.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LiuXJ on 2017/9/15.s
 */

@Module(includes = {DataLayerModule.class, ClientAPIModule.class})
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    /**
     * 提供Application单例对象
     *
     * @return Application
     */
    @Singleton
    @Provides
    Application provideApplication() {
        return mApplication;
    }
}