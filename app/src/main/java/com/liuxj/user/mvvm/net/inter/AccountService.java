package com.liuxj.user.mvvm.net.inter;

import com.liuxj.user.mvvm.net.Result;

import io.reactivex.Observable;

/**
 * Created by LiuXJ on 2017/9/15.
 */

public interface AccountService {
    Observable<Result> doLogin();
}
