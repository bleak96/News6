package com.example.asus.news.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.news.R;
import com.example.asus.news.models.TutItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TutAdapter extends BaseAdapter<TutItem, TutAdapter.ViewHolder> {

    public TutAdapter(Context context, @Nullable List<TutItem> list) {
        super(context, list);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflate(parent, R.layout.item_news));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, TutItem item) {
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());
        holder.date.setText(item.getPubDate());
        holder.link.setText(item.getLink());


    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_news_title)
        protected TextView title;
        @BindView(R.id.tv_news_description)
        protected TextView description;
        @BindView(R.id.tv_news_date)
        protected TextView date;
        @BindView(R.id.tv_news_link)
        protected TextView link;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}