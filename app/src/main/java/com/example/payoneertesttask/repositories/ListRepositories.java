package com.example.payoneertesttask.repositories;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.payoneertesttask.R;
import com.example.payoneertesttask.apis.ApiCallService;
import com.example.payoneertesttask.apis.ApiInterface;
import com.example.payoneertesttask.models.ListResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListRepositories {
    private static final String BASE_URL = "https://raw.githubusercontent.com/optile/checkout-android/develop/shared-test/lists/";

    private final ApiCallService mApiCallService;
    private Context mContext;
    private MutableLiveData<ListResult> mListResultLiveData;

    public ListRepositories(Context context) {
        mContext = context;
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
                    showDialog(false);
                }
            }

            @Override
            public void onFailure(Call<ListResult> call, Throwable t) {
                Log.e("ListRepositories", "response failed" + t);
                showDialog(true);
            }
        });
    }

    private void showDialog(boolean isFailed) {
        Dialog dialog = new Dialog(mContext);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();

        Button okayBtn = dialog.findViewById(R.id.id_dialog_btn_okay);
        Button cancelBtn = dialog.findViewById(R.id.id_dialog_btn_cancel);
        TextView dialogText = dialog.findViewById(R.id.id_dialog_text);
        ImageView dialogIcon = dialog.findViewById(R.id.id_dialog_icon);

        okayBtn.setBackgroundColor(ContextCompat.getColor(mContext, R.color.teal_700));
        cancelBtn.setBackgroundColor(ContextCompat.getColor(mContext, R.color.red_secondary));

        if(isFailed) {
            okayBtn.setText("Retry");
            dialogText.setText("Something went wrong\nPlease check network connection and retry");
            dialogIcon.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_cancel_icon));
        } else {
            dialogText.setText("Server Error\nPlease check after sometime");
            dialogIcon.setImageDrawable(ContextCompat.getDrawable(mContext, R.drawable.ic_server_icon));
        }

        okayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFailed) {
                    fetchData();
                }
                dialog.dismiss();
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    public LiveData<ListResult> getListLiveData() {
        return mListResultLiveData;
    }

}
