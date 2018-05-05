package com.example.pingoui.dronality.Home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pingoui.dronality.R;

/**
 * Created by pingoui on 12.03.2018.
 */

public class Home_Fragment extends Fragment {
    private static final String TAG = "Home_Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        return view;

    }


    private void setupViewPager(){

       /* ViewPager mViewPager = (ViewPager)  ViewPager.findViewById(R.id.post_row);
        mViewPager.setAdapter(mAdapter);
        ViewPager viewPager=(ViewPager) findViewById(R.id.content);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);*/




    }
}
