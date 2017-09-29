package com.liuxj.user.mvvm.base;

import com.google.gson.Gson;
import com.liuxj.user.mvvm.inject.ApplicationComponent;
import com.liuxj.user.mvvm.net.ClientAPI;

/**
 * BaseManager
 *
 * @author gavin.xiong 2017/4/28
 */
public abstract class BaseManager {

//    @Inject
    ClientAPI mApi;
//    @Inject
    Gson mGson;

    public BaseManager() {
        ApplicationComponent.Instance.get().inject(this);
    }

    public ClientAPI getApi() {
        return mApi;
    }

    public Gson getGson() {
        return mGson;
    }
}
