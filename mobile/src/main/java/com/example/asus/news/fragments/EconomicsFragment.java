package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.asus.news.R;
import com.example.asus.news.adapters.BaseAdapter;

import retrofit2.Callback;

import com.example.asus.news.api.TutService;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class EconomicsFragment extends RecyclerViewCustomFragment {

    private BaseAdapter adapter;
    private RecyclerView.Adapter recycler_adapter;
    static final String TUT_URL = "https://news.tut.by";

    public static EconomicsFragment newInstance() {
        Bundle args = new Bundle();
        EconomicsFragment fragment = new EconomicsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Retrofit retrofit = new Retrofit.Builder().baseUrl(TUT_URL).addConverterFactory(SimpleXmlConverterFactory.create()).build();
        TutService tutService = retrofit.create(TutService.class);
        Call<TutNews> call = tutService.getEconomicsNews();
        call.enqueue(new Callback<TutNews>() {

            @Override
            public void onResponse(Call<TutNews> call, Response<TutNews> response) {
                TutNews tutNews = response.body();
                List<TutNews> tutNewsList = new ArrayList<>();
                tutNewsList.add(new TutNews(tutNews.getTitle(), tutNews.getLink(), tutNews.getPubDate()));
                adapter = new BaseAdapter(tutNewsList);

            }

            @Override
            public void onFailure(Call<TutNews> call, Throwable t) {

            }

        });


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        setAdapter(adapter);

    }

}