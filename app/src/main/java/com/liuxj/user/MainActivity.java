package com.liuxj.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.liuxj.user.mvvm.base.BindingActivity;
import com.liuxj.user.databinding.ActivityMainBinding;
import com.liuxj.user.mvvm.MVVMActivity;

public class MainActivity extends BindingActivity<ActivityMainBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {
        binding.tvInfo.setOnClickListener(view -> {startActivity(new Intent(MainActivity.this,MVVMActivity.class));});
    }
}
