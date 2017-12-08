package com.example.asus.news.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.asus.news.R;
import butterknife.BindView;
import butterknife.ButterKnife;


public class RecyclerViewCustomFragment extends Fragment {


    @BindView(R.id.recycler_view)
    protected RecyclerView recyclerView;

    private RecyclerView.Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycler_view,container,false);

    }

    @Override
    public void onViewCreated (View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        ButterKnife.bind(view);

    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        this.adapter = adapter;
        recyclerView.setAdapter(adapter);
    }

    private RecyclerView.Adapter getAdapter() {
        return adapter;
    }

}