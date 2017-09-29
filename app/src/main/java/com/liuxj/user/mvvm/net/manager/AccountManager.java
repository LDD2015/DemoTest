package com.liuxj.user.mvvm.net.manager;

import com.liuxj.user.mvvm.base.BaseManager;
import com.liuxj.user.mvvm.net.Result;
import com.liuxj.user.mvvm.net.inter.AccountService;

import io.reactivex.Observable;

/**
 * Created by LiuXJ on 2017/9/15.
 */

public class AccountManager extends BaseManager implements AccountService{
    @Override
    public Observable<Result> doLogin() {
        return null;
    }
}
