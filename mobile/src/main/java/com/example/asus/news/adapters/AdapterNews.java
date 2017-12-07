package com.example.asus.news.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.news.R;
import com.example.asus.news.models.TutNews;

import java.util.ArrayList;


public class AdapterNews extends ArrayAdapter<TutNews> {

    public AdapterNews(Context context, ArrayList<TutNews> words, int colorResourceId) {
        super(context, 0, words);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TutNews currentNews = getItem(position);

        TextView tittleView = (TextView) listItemView.findViewById(R.id.news_title);
        tittleView.setText(currentNews.getTitle());

        ImageView descriptionView = (ImageView) listItemView.findViewById(R.id.news_description);
        if (currentNews.hasImage()) {

            descriptionView.setImageResource(currentNews.getDescription());

            descriptionView.setVisibility(View.VISIBLE);
        } else {

            descriptionView.setVisibility(View.GONE);
        }


        TextView linkView = (TextView) listItemView.findViewById(R.id.news_link);
        linkView.setText(currentNews.getLink());

        TextView pubDateView = (TextView) listItemView.findViewById(R.id.news_date);
        pubDateView.setText(currentNews.getPubDate());






        return listItemView;
    }
}
