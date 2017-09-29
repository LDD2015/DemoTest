package com.liuxj.user.mvvm.net;

import io.reactivex.Observable;


/**
 * Created by LiuXJ on 2017/9/15.
 */

public class ClientAPI {
    @FormUrlEncoded
    @POST("ArtLibrary/IsExitMobile")
    Observable<Result> checkPhone(
            @Field("phone") String phone,
            @Field("token") String token);
}
