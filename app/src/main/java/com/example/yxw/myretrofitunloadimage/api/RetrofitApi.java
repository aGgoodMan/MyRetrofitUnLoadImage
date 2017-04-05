package com.example.yxw.myretrofitunloadimage.api;

import com.example.yxw.myretrofitunloadimage.beans.RetrofitBean;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * TODO
 * Created by yxw on 2017/2/14.
 */

public interface RetrofitApi {

    //图片上传
    @Multipart
    @POST("usersApp!pUpdateHeadImage.action")
    Call<RetrofitBean> updateImage(@PartMap Map<String,RequestBody> params);
}
