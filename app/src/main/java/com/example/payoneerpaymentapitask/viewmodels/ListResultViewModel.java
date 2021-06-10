package com.example.payoneerpaymentapitask.viewmodels;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.payoneerpaymentapitask.models.ListResult;
import com.example.payoneerpaymentapitask.repositories.ListResultRepository;

public class ListResultViewModel extends AndroidViewModel {

    private ListResultRepository mListResultRepository;
    private LiveData<ListResult> mListResultLiveData;

    public ListResultViewModel(Application application) {
        super(application);
    }

    public void init(Context context) {
        mListResultRepository = new ListResultRepository(context);
        mListResultLiveData = mListResultRepository.getListLiveData();
    }

    public void fetchData() {
        mListResultRepository.fetchData();
    }

    public LiveData<ListResult> getListResultLiveData() {
        return mListResultLiveData;
    }
}
