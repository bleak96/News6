package com.example.asus.news.activity;


import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.asus.news.R;
import com.example.asus.news.adapters.FragmentAdapter;
import com.example.asus.news.fragments.RecyclerViewCustomFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

        }
        ButterKnife.bind(this);

        initViewPager();
    }

    private void initViewPager() {
        FragmentAdapter pagerAdapter = new FragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }
}