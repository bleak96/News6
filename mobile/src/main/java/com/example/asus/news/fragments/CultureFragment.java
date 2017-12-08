package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import com.example.asus.news.adapters.CultureAdapter;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;
import java.util.List;

public class CultureFragment extends RecyclerViewCustomFragment {
    private CultureAdapter adapter;

    public static CultureFragment newInstance() {
        Bundle args = new Bundle();
        CultureFragment fragment = new CultureFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<TutNews> tutNewsList = new ArrayList<>();
        for (int i=0;i<100;i++){
            tutNewsList.add(new TutNews(Integer.toString(i),i,Integer.toString(i),i));
        }
        adapter = new CultureAdapter(tutNewsList);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }

}