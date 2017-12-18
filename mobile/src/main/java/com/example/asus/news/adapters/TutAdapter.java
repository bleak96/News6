package com.example.asus.news.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asus.news.R;
import com.example.asus.news.models.TutItem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TutAdapter extends BaseAdapter<TutItem, TutAdapter.ViewHolder> {

    public TutAdapter(Context context, @Nullable List<TutItem> list) {
        super(context, list);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("EEE 'в' HH:mm");
        return timeFormat.format(dateObject);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflate(parent, R.layout.item_news));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, TutItem item) {
        holder.title.setText(item.getTitle());

        Glide.with(holder.description.getContext())
                .load( item.getImageUrl().replace("\"", ""))
                .into(holder.description);

        Date dateObject = new Date(item.getPubDate());
        String formattedTime = formatTime(dateObject);
        holder.date.setText(formattedTime);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_news_title)
        protected TextView title;
        @BindView(R.id.tv_news_description)
        protected ImageView description;
        @BindView(R.id.tv_news_date)
        protected TextView date;

        ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}