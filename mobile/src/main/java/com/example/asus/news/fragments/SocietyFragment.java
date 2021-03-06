package com.example.asus.news.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.example.asus.news.adapters.TutAdapter;
import com.example.asus.news.api.RetroClient;
import com.example.asus.news.api.TutService;
import com.example.asus.news.models.Rss;
import com.example.asus.news.models.TutChannel;
import com.example.asus.news.models.TutItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SocietyFragment extends RecyclerViewFragment implements Callback<Rss> {

    private static final String TAG = "SocietyFragment";

    private TutAdapter adapter;

    public static SocietyFragment newInstance() {
        Bundle args = new Bundle();
        SocietyFragment fragment = new SocietyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new TutAdapter(getContext(), null);
        TutService tutService = RetroClient.getTutNews();
        Call<Rss> call = tutService.getSocietyNews();
        call.enqueue(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapter(adapter);
    }

    @Override
    public void onResponse(Call<Rss> call, Response<Rss> response) {
        Rss rss = response.body();
        if (response.isSuccessful() && null != rss) {
            TutChannel channel = rss.getChannel();
            List<TutItem> items = channel.getItems();
            adapter.addAll(items);
        }
    }

    @Override
    public void onFailure(Call<Rss> call, Throwable t) {
        t.printStackTrace();
        Log.d(TAG, "onFailure: ");
    }
}