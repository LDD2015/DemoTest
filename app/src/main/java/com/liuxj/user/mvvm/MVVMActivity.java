package com.liuxj.user.mvvm;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.liuxj.user.R;
import com.liuxj.user.databinding.ActivityLoginBinding;
import com.liuxj.user.mvvm.base.BindingActivity;

public class MVVMActivity extends BindingActivity<ActivityLoginBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {
        binding.btnLogin.setOnClickListener(view -> {doLogin();});
    }

    private void doLogin(){
        getDataLayer().getAccountService().doLogin();
    }

//    getDataLayer().getAccountService().login(phone, pass)
//                .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .doOnSubscribe(disposable -> {
//        mCompositeDisposable.add(disposable);
//        showNormalProgressDialog();
//    })
//            .doOnComplete(this::dismissNormalProgressDialog)
//                .doOnError(throwable -> dismissNormalProgressDialog())
//            .subscribe(result -> {
//        if (result.isSuccess() && result.getData() != null) {
//            App.setUser(result.getData());
//            SPUtil.saveString(BundleKey.USER, JsonUtil.toJson(result.getData()));
//            RxBus.get().post(new LoginStatusEvent(true, pageId));
//            RxBus.get().post(new PopFragmentEvent());
//        } else {
//            Snackbar.make(binding.button, result.getMessage(), Snackbar.LENGTH_LONG).show();
//        }
//    }, e -> handleError(e.getMessage()));

}
