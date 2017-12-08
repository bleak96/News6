package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.news.R;
import com.example.asus.news.adapters.CustomAdapter;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;
import java.util.List;

public class EconomicsFragment extends RecyclerViewCustomFragment {

    private CustomAdapter adapter;

    public static EconomicsFragment newInstance() {
        Bundle args = new Bundle();
        EconomicsFragment fragment = new EconomicsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<TutNews> tutNewsList = new ArrayList<>();
        for(int i=0; i<100; i++) {
            tutNewsList.add(new TutNews());
        }
        adapter = new CustomAdapter(tutNewsList);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }
}