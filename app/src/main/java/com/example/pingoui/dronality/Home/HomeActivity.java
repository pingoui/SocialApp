package com.example.pingoui.dronality.Home;

import android.content.Context;
import android.icu.lang.UCharacter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pingoui.dronality.R;
import com.example.pingoui.dronality.utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private Context mContext=HomeActivity.this;
    private static final int ACTIVITY_NUM=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: starting");
        setupBottomNavigationView();
        setupViewPager();

    }

    private void setupViewPager(){
        PostPagerAdapter mAdapter = new PostPagerAdapter(this);
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FiltersFragment());
        adapter.addFragment(new Home_Fragment());
        adapter.addFragment(new CameraFragment());

        //ViewPager mViewPager = (ViewPager)  findViewById(R.id.post_row);
       // mViewPager.setAdapter(mAdapter);
        ViewPager viewPager=(ViewPager) findViewById(R.id.content);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(2).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_logo);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_filters);


    }
    //bottomNavigationView setup
    private void setupBottomNavigationView(){
        Log.d(TAG, "setup bottomNAvigationView started");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavigation);
        BottomNavigationViewHelper.setupBottmNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        bottomNavigationViewEx.enableShiftingMode(true);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
