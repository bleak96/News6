package com.example.asus.news.fragments;

import android.os.Bundle;

public class SocietyFragment extends RecyclerViewFragment {

    public static SocietyFragment newInstance() {
        Bundle args = new Bundle();
        SocietyFragment fragment = new SocietyFragment();
        fragment.setArguments(args);
        return fragment;
    }
}