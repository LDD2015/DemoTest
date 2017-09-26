package com.liuxj.user.mvvm.inject.module;

import com.liuxj.user.mvvm.net.manager.AccountManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LiuXJ on 2017/9/15.
 */
@Module
public class DataLayerModule {
    @Singleton
    @Provides
    AccountManager provideAccountManager() {
        return new AccountManager();
    }
}
