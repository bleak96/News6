package com.example.asus.news.activity;


import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.asus.news.R;
import com.example.asus.news.adapters.FragmentAdapter;
import com.example.asus.news.api.RetroClient;
import com.example.asus.news.api.TutService;
import com.example.asus.news.models.TutNews;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TutService tutBy = RetroClient.getTutNews();
        List<TutNews> newsList = tutBy.getNews();

        FragmentAdapter adapter = new FragmentAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //set to adapter
    }

}