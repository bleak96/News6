package com.example.asus.news.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.asus.news.R;
import com.example.asus.news.fragments.AccidentsFragment;
import com.example.asus.news.fragments.CultureFragment;
import com.example.asus.news.fragments.EconomicsFragment;
import com.example.asus.news.fragments.SocietyFragment;
import com.example.asus.news.fragments.WorldFragment;


public class FragmentAdapter extends FragmentPagerAdapter {

    private static final int FRAGMENT_ECONOMICS = 0;
    private static final int FRAGMENT_SOCIETY = 1;
    private static final int FRAGMENT_WORLD = 2;
    private static final int FRAGMENT_CULTURE = 3;
    private static final int FRAGMENT_ACCIDENTS = 4;

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case FRAGMENT_ECONOMICS:
                return new EconomicsFragment();
            case FRAGMENT_SOCIETY:
                return new SocietyFragment();
            case FRAGMENT_WORLD:
                return new WorldFragment();
            case FRAGMENT_CULTURE:
                return new CultureFragment();
            case FRAGMENT_ACCIDENTS:
                return new AccidentsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case FRAGMENT_ECONOMICS:
                return getTitle(R.string.title_fragment_economics);
            case FRAGMENT_SOCIETY:
                return getTitle(R.string.title_fragment_society);
            case FRAGMENT_WORLD:
                return getTitle(R.string.title_fragment_world);
            case FRAGMENT_CULTURE:
                return getTitle(R.string.title_fragment_culture);
            case FRAGMENT_ACCIDENTS:
                return getTitle(R.string.title_fragment_accidents);
            default:
                return null;
        }
    }

    @NonNull
    private String getTitle(@StringRes int resId) {
        return context.getString(resId);
    }
}