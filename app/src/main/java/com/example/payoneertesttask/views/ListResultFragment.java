package com.example.payoneertesttask.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.payoneertesttask.R;
import com.example.payoneertesttask.adapters.ListResultRecyclerViewAdapter;
import com.example.payoneertesttask.models.ListResult;
import com.example.payoneertesttask.viewmodels.ListViewModel;

import static android.widget.LinearLayout.HORIZONTAL;

public class ListResultFragment extends Fragment {

    private ListViewModel mListViewModel;
    private ListResultRecyclerViewAdapter mListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mListAdapter = new ListResultRecyclerViewAdapter();
        mListViewModel = new ViewModelProvider(this).get(ListViewModel.class);
        mListViewModel.init(getContext());
        mListViewModel.getListResultLiveData().observe(this, new Observer<ListResult>() {
            @Override
            public void onChanged(ListResult listResult) {
                mListAdapter.setValues(listResult.getNetworks().getApplicable());
            }
        });
        mListViewModel.fetchData();
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