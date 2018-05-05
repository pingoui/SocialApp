package com.example.pingoui.dronality.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.pingoui.dronality.Add.AddActivity;
import com.example.pingoui.dronality.Home.HomeActivity;
import com.example.pingoui.dronality.Profile.ProfileActivity;
import com.example.pingoui.dronality.R;
import com.example.pingoui.dronality.Search.SearchActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by pingoui on 12.03.2018.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavViewHelper";

    public static void setupBottmNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

        Log.d(TAG,"setup NavigationBar activ");

    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1=new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_profile:
                        Intent intent2=new Intent(context, ProfileActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_search:
                        Intent intent3=new Intent(context, SearchActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_add:
                        Intent intent4=new Intent(context, AddActivity.class);
                        context.startActivity(intent4);
                        break;



                }

                return false;
            }
        });

    }
}
