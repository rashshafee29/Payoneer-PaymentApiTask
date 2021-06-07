package com.example.payoneertesttask.repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.payoneertesttask.apis.ApiCallService;
import com.example.payoneertesttask.apis.ApiInterface;
import com.example.payoneertesttask.models.ListResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListRepositories {
    private static final String BASE_URL = "https://raw.githubusercontent.com/optile/checkout-android/develop/shared-test/lists/";

    private final ApiCallService mApiCallService;

    private MutableLiveData<ListResult> mListResultLiveData;

    public ListRepositories() {
        mListResultLiveData = new MutableLiveData<>();
        mApiCallService = new ApiCallService(BASE_URL);
    }

    public void fetchData() {
        ApiInterface apiInterface = mApiCallService.buildService(ApiInterface.class);
        Call<ListResult> dataCall = apiInterface.getListData();
        dataCall.enqueue(new Callback<ListResult>() {
            @Override
            public void onResponse(Call<ListResult> call, Response<ListResult> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        mListResultLiveData.postValue(response.body());
                    }
                } else {
                    Log.e("ListRepositories", "getListData() - response.code: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<ListResult> call, Throwable t) {
                Log.e("ListRepositories", "response failed" + t);
            }
        });
    }

    public LiveData<ListResult> getListLiveData() {
        return mListResultLiveData;
    }

}
