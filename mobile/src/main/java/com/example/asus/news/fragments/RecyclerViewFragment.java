package com.example.asus.news.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.news.R;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        this.adapter = adapter;
        recyclerView.setAdapter(adapter);
    }

    private RecyclerView.Adapter getAdapter() {
        return adapter;
    }
}