/*
package com.liuxj.user.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

*/
/**
 * DataBinding Fragment 基类
 *
 * @author gavin.xiong 2017/1/4  2017/1/4
 *//*

public abstract class BindingFragment<T extends ViewDataBinding> extends BaseFragment {

    protected T binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        return binding.getRoot();
        // return attachToSwipeBack(binding.getRoot()); // 侧滑返回
    }

    protected abstract int getLayoutId();
}
*/
