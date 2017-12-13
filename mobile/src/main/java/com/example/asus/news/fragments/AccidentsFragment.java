package com.example.asus.news.fragments;

import android.os.Bundle;

public class AccidentsFragment extends RecyclerViewFragment {

    public static AccidentsFragment newInstance() {
        Bundle args = new Bundle();
        AccidentsFragment fragment = new AccidentsFragment();
        fragment.setArguments(args);
        return fragment;
    }
}