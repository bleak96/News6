package com.example.asus.news.fragments;

import android.os.Bundle;

public class CultureFragment extends RecyclerViewFragment {

    public static CultureFragment newInstance() {
        Bundle args = new Bundle();
        CultureFragment fragment = new CultureFragment();
        fragment.setArguments(args);
        return fragment;
    }
}