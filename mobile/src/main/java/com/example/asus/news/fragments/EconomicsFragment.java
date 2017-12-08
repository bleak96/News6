package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import com.example.asus.news.adapters.EconomicsAdapter;
import com.example.asus.news.models.TutNews;
import java.util.ArrayList;
import java.util.List;

public class EconomicsFragment extends RecyclerViewCustomFragment {

    private EconomicsAdapter adapter;

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
        for(int i=0; i<10; i++) {
            tutNewsList.add(new TutNews(Integer.toString(i),i,Integer.toString(i)+"hi",i));
        }
        adapter = new EconomicsAdapter(tutNewsList);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }
}