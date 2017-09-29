package com.liuxj.user.mvvm.net;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by LiuXJ on 2017/9/15.
 */

public interface ClientAPI {

    @FormUrlEncoded
    @POST("...")
    Observable<Result> doLogin();
}
