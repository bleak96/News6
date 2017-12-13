package com.example.asus.news.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import com.example.asus.news.R;
import com.example.asus.news.adapters.TouchListener;
import com.example.asus.news.adapters.TutAdapter;
import com.example.asus.news.models.TutItem;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private TutAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_view, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new TutAdapter(getContext(), new ArrayList<TutItem>());
        recyclerView.addOnItemTouchListener(new TouchListener(getContext(), recyclerView, new OnClickListener() {
            @Override
            public void onClick(View view, int position) {

                TutItem currentItem = mAdapter.getItem(position);
                Uri itemUri = Uri.parse(currentItem.getLink());
                Intent intent = new Intent(Intent.ACTION_VIEW, itemUri);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {
                TutItem currentItem = mAdapter.getItem(position);
                Uri itemUri = Uri.parse(currentItem.getLink());
                Intent intent = new Intent(Intent.ACTION_VIEW, itemUri);
                startActivity(intent);
            }
        }));
        return view;
    }




    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        this.adapter = adapter;
        recyclerView.setAdapter(adapter);
    }

    private RecyclerView.Adapter getAdapter() {
        return adapter;
    }

    public interface OnClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

}
