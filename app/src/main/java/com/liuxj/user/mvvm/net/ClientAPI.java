package com.liuxj.user.mvvm.net;


import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;

/**
 * Created by LiuXJ on 2017/9/15.
 */

public class ClientAPI {
    @FormUrlEncoded
    @POST("...")
    Observable<Result> checkPhone(
            @Field("phone") String phone,
            @Field("token") String token);
}
