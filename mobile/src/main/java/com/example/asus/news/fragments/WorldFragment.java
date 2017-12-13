package com.example.asus.news.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class WorldFragment extends RecyclerViewFragment {

    public static WorldFragment newInstance() {
        Bundle args = new Bundle();
        WorldFragment fragment = new WorldFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}