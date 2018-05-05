package com.example.pingoui.dronality.Search;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pingoui.dronality.R;
import com.example.pingoui.dronality.utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by pingoui on 12.03.2018.
 */

public class SearchActivity extends AppCompatActivity {
    private static final String TAG ="SearchActivity";

    private Context mContext=SearchActivity.this;
    private static final int ACTIVITY_NUM=2;

    protected void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "on Create: started");

        setupBottomNavigationView();

    }


    //bottomNavigationView setup
    private void setupBottomNavigationView(){
        Log.d(TAG, "setup bottomNAvigationView started");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavigation);
        BottomNavigationViewHelper.setupBottmNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }



}
