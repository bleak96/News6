package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import com.example.asus.news.adapters.BaseAdapter;
import com.example.asus.news.models.TutNews;
import java.util.ArrayList;
import java.util.List;

public class SocietyFragment extends RecyclerViewCustomFragment {

    private BaseAdapter adapter;

    public static SocietyFragment newInstance() {
        Bundle args = new Bundle();
        SocietyFragment fragment = new SocietyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<TutNews> tutNewsList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tutNewsList.add(new TutNews(Integer.toString(i), Integer.toString(i), Integer.toString(i)));
        }
        adapter = new BaseAdapter(tutNewsList);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }

}