package com.example.payoneertesttask.viewmodels;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.payoneertesttask.models.ListResult;
import com.example.payoneertesttask.repositories.ListRepositories;

public class ListViewModel extends AndroidViewModel {

    private ListRepositories mListRepositories;
    private LiveData<ListResult> mListResultLiveData;

    public ListViewModel(Application application) {
        super(application);
    }

    public void init(Context context) {
        mListRepositories = new ListRepositories(context);
        mListResultLiveData = mListRepositories.getListLiveData();
    }

    public void fetchData() {
        mListRepositories.fetchData();
    }

    public LiveData<ListResult> getListResultLiveData() {
        return mListResultLiveData;
    }
}
