package com.example.payoneerpaymentapitask.apis;

import com.example.payoneerpaymentapitask.models.ListResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("listresult.json")
    Call<ListResult>getListData();
}
