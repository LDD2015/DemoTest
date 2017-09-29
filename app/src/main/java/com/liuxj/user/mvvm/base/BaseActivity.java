package com.liuxj.user.mvvm.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatDelegate;

import com.liuxj.user.mvvm.inject.ApplicationComponent;

/**
 * Activity 基类
 *
 * @author gavin.xiong 2016/12/30  2016/12/30
 */
public abstract class BaseActivity extends SupportActivity {

//    @Inject
    DataLayer mDataLayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 兼容vector
//        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView();
//        ApplicationComponent.Instance.get().inject(this);
        mDataLayer = new DataLayer();
        afterCreate(savedInstanceState);
    }
    public DataLayer getDataLayer() {
        return mDataLayer;
    }

    public abstract void setContentView();
    protected abstract void afterCreate(@Nullable Bundle savedInstanceState);


}
