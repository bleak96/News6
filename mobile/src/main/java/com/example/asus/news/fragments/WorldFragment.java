package com.example.asus.news.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.news.R;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;

/**
 * Created by ASUS on 07.12.2017.
 */

public class WorldFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
        ArrayList<TutNews> news = new ArrayList<TutNews>();






        return rootView;
        }
}
