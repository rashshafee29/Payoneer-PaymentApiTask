package com.example.payoneertesttask.apis;

import com.example.payoneertesttask.models.ListResult;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("listresult.json")
    Call<ListResult>getListData();
}
