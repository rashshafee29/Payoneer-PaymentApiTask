package com.example.payoneerpaymentapitask.apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCallService {

    private final Retrofit mRetrofit;

    public ApiCallService(String url) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T buildService(Class<T> service) {
        return mRetrofit.create(service);
    }
}
