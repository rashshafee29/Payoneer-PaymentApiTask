package com.example.payoneerpaymentapitask;
import com.example.payoneerpaymentapitask.apis.ApiCallService;
import com.example.payoneerpaymentapitask.apis.ApiInterface;
import com.example.payoneerpaymentapitask.models.ListResult;
import com.example.payoneerpaymentapitask.utils.Constant;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class ApiCallTest {

    @Test
    public void apiCallSuccessfulResponseTest() throws IOException {
        ApiCallService apiCallService = new ApiCallService(Constant.BASE_URL);
        ApiInterface apiInterface = apiCallService.buildService(ApiInterface.class);
        Call<ListResult> dataCall = apiInterface.getListData();
        Response<ListResult> response = dataCall.execute();
        Assert.assertTrue(response.isSuccessful());
    }

}
