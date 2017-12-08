package com.example.asus.news.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.news.R;
import com.example.asus.news.models.TutNews;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private String[] mNews;

    public CustomAdapter(String[] news) {
        mNews = news;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d("Custom adapter", "Element " + position + " set.");
        viewHolder.textView.setText(mNews[position]);
    }

    @Override
    public int getItemCount() {
        return mNews.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.recycler_view)
        TextView textView;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}