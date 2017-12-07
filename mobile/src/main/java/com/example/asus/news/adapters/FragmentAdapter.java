package com.example.asus.news.adapters;
import android.content.Context;
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
    private Context mContext;

    public FragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EconomicsFragment();
        } else if (position == 1) {
            return new SocietyFragment();
        } else if (position == 2) {
            return new WorldFragment();
        } else if (position == 3) {
            return new CultureFragment();
        } else {
            return new AccidentsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

}