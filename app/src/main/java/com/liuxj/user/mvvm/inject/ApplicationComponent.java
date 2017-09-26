package com.liuxj.user.mvvm.inject;

import android.app.Application;
import android.support.annotation.NonNull;

import com.liuxj.user.mvvm.base.BaseActivity;
import com.liuxj.user.mvvm.base.BaseManager;
import com.liuxj.user.mvvm.inject.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by LiuXJ on 2017/9/15.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity activity);

//    void inject(BaseFragment fragment);
//
//    void inject(BaseBottomSheetDialog dialogFragment);
//
    void inject(BaseManager manager);
//
//    void inject(HttpHelper httpHelper);

    // 可以获取 ApplicationModule 及其 includes 的所有 Module 提供的对象（方法名随意）
    Application getApplication();

    class Instance {

        private static ApplicationComponent sComponent;

        public static void init(@NonNull ApplicationComponent component) {
            sComponent = component;
        }

        public static ApplicationComponent get() {
            return sComponent;
        }
    }

}
