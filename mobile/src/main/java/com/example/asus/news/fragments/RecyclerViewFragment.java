package com.example.asus.news.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.news.R;
import com.example.asus.news.adapters.TouchListener;
import com.example.asus.news.adapters.TutAdapter;
import com.example.asus.news.models.TutItem;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_view, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

        recyclerView.addOnItemTouchListener(new TouchListener(getContext(), recyclerView, new OnClickListener() {
            @Override
            public void onClick(View view, int position) {
                TutItem currentItem = ((TutAdapter) adapter).getItem(position);
                CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder().build();
                customTabsIntent.launchUrl(getContext(), Uri.parse(currentItem.getLink()));
            }

            @Override
            public void onLongClick(View view, int position) {
                onClick(view, position);
//                TutItem currentItem = ((TutAdapter) adapter).getItem(position); на случай если захочу переходить в браузер лонг кликом
//                Uri itemUri = Uri.parse(currentItem.getLink());
//                Intent intent = new Intent(Intent.ACTION_VIEW, itemUri);
//                startActivity(intent);
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
