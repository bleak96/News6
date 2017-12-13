package com.example.asus.news.fragments;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.asus.news.R;
import com.example.asus.news.adapters.BaseAdapter;

import retrofit2.Callback;

import com.example.asus.news.api.RetroClient;
import com.example.asus.news.api.TutService;
import com.example.asus.news.models.Rss;
import com.example.asus.news.models.TutChannel;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class EconomicsFragment extends RecyclerViewCustomFragment {

    private static final String TAG = "EconomicsFragment";

    private BaseAdapter adapter;

    public static EconomicsFragment newInstance() {
        Bundle args = new Bundle();
        EconomicsFragment fragment = new EconomicsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        TutService tutService = RetroClient.getTutNews();

        Call<Rss> call = tutService.getEconomicsNews();
        call.enqueue(new Callback<Rss>() {

            @Override
            public void onResponse(Call<Rss> call, Response<Rss> response) {
                Log.d(TAG, "onResponse: ");
                Rss tutNews = response.body();
                Log.d(TAG, "onResponse: "+tutNews.getChannel());
//                List<TutNews> tutNewsList = new ArrayList<>();
//                tutNewsList.add(new TutNews(tutNews.getTitle(), tutNews.getLink(), tutNews.getPubDate()));
//                adapter = new BaseAdapter(tutNewsList);
            }

            @Override
            public void onFailure(Call<Rss> call, Throwable t) {
                t.printStackTrace();
                Log.d(TAG, "onFailure: ");
            }
        });
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }
}