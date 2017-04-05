package com.example.yxw.myretrofitunloadimage;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.yxw.myretrofitunloadimage.api.RetrofitApi;
import com.example.yxw.myretrofitunloadimage.beans.RetrofitBean;

import java.io.File;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
//    接口地址
//    https://kwz.kjkj123.cn//users/usersApp!pUpdateHeadImage.action?userId=39faf777fda34a1fa80df9af0e2a05c3&file=

    final static String BASE_IP = "https://kwz.kjkj123.cn//users/";
    final static String USER_ID = "39faf777fda34a1fa80df9af0e2a05c3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        method4();
    }

    private void method4() {
        String path = Environment.getExternalStorageDirectory()+File.separator+"yxw"+File.separator+"1.png";
//        File file = new File("/storage/emulated/0/2.jpg");
        File file = new File(path);

        Map<String, RequestBody> params = HttpParameterBuilder.newBuilder()
                .addParameter("userId",USER_ID)
                .addParameter("file",file)
                .bulider();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_IP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitApi api = retrofit.create(RetrofitApi.class);
        Call<RetrofitBean> call = api.updateImage(params);
        call.enqueue(new Callback<RetrofitBean>() {
            @Override
            public void onResponse(Call<RetrofitBean> call, Response<RetrofitBean> response) {
                RetrofitBean body = response.body();
                String data = body.getData();
                Log.e("====", "===onResponse==="+data);
            }

            @Override
            public void onFailure(Call<RetrofitBean> call, Throwable t) {
                Log.e("====", "===onFailure===");
            }
        });

    }
}
