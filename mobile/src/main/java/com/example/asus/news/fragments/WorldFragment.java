package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import com.example.asus.news.adapters.WorldAdapter;
import com.example.asus.news.models.TutNews;
import java.util.ArrayList;
import java.util.List;

public class WorldFragment extends RecyclerViewCustomFragment {

    private WorldAdapter adapter;

    public static WorldFragment newInstance() {
        Bundle args = new Bundle();
        WorldFragment fragment = new WorldFragment();
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
        adapter = new WorldAdapter(tutNewsList);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }

}
