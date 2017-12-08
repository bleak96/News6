package com.example.asus.news.adapters;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.news.R;
import com.example.asus.news.models.TutNews;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WorldAdapter extends RecyclerView.Adapter<WorldAdapter.ViewHolder> {

    private List<TutNews> newsList;

    public WorldAdapter(@Nullable List<TutNews> newsList) {
        this.newsList = newsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        TutNews news = newsList.get(position);
        viewHolder.title.setText(news.getTitle());
        viewHolder.description.setText(news.getDescription());
        viewHolder.link.setText(news.getLink());
        viewHolder.date.setText(news.getPubDate());
    }

    @Override
    public int getItemCount() {
        return newsList != null ? newsList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.news_title) TextView title;
        @BindView(R.id.news_description) TextView description;
        @BindView(R.id.news_link) TextView link;
        @BindView(R.id.news_date) TextView date;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this,v);
        }
    }

}