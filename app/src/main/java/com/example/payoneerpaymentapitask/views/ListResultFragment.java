package com.example.payoneerpaymentapitask.views;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.payoneerpaymentapitask.R;
import com.example.payoneerpaymentapitask.adapters.ListResultRecyclerViewAdapter;
import com.example.payoneerpaymentapitask.models.ListResult;
import com.example.payoneerpaymentapitask.viewmodels.ListResultViewModel;

public class ListResultFragment extends Fragment {

    private ListResultViewModel mListResultViewModel;
    private ListResultRecyclerViewAdapter mListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListAdapter = new ListResultRecyclerViewAdapter();
        mListResultViewModel = new ViewModelProvider(this).get(ListResultViewModel.class);
        mListResultViewModel.init(getContext());
        mListResultViewModel.getListResultLiveData().observe(this, new Observer<ListResult>() {
            @Override
            public void onChanged(ListResult listResult) {
                mListAdapter.setValues(listResult.getNetworks().getApplicable());
            }
        });
        mListResultViewModel.fetchData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_result, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.list_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mListAdapter);
        return view;
    }
}