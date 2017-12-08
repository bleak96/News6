package com.example.asus.news.adapters;
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


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<TutNews> newsList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.news_title) TextView title;
        @BindView(R.id.news_description) TextView description;
        @BindView(R.id.news_link) TextView link;
        @BindView(R.id.news_date) TextView date;
//        TextView title, description, link, date;

        ViewHolder(View v) {
            super(v);
                ButterKnife.bind(this,v);
//            title = (TextView) v.findViewById(R.id.news_title);
//            description = (TextView) v.findViewById(R.id.news_description);
//            link = (TextView) v.findViewById(R.id.news_link);
//            date = (TextView) v.findViewById(R.id.news_date);
        }
    }

    public CustomAdapter(List<TutNews> newsList) {
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
        return newsList.size();
    }
}
//
//   @Override
//    public int getItemCount() {
//        return mNews.length;
//    }
//
//   static class ViewHolder extends RecyclerView.ViewHolder {
//
//    @BindView(R.id.recycler_view)
//    TextView textView;
//
//    ViewHolder(View v) {
//        super(v);
//        ButterKnife.bind(this, v);
//    }
//}
//}