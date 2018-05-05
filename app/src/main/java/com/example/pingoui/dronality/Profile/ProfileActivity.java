package com.example.pingoui.dronality.Profile;



import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pingoui.dronality.Home.CameraFragment;
import com.example.pingoui.dronality.Home.FiltersFragment;
import com.example.pingoui.dronality.Home.Home_Fragment;
import com.example.pingoui.dronality.Home.SectionPagerAdapter;
import com.example.pingoui.dronality.R;
import com.example.pingoui.dronality.utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


/**
 * Created by pingoui on 12.03.2018.
 */

public class  ProfileActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG ="ProfileActivity";
    private static final int NUM_ITEMS=5;
    private Context mContext = ProfileActivity.this;
    private static final int ACTIVITY_NUM=1;
    private ViewPager viewPager;
    ImageView back_button;
    FragmentManager fragmentManager;

    private ViewPager mPager;

    protected void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);

        setContentView(R.layout.activity_profile);
        Log.d(TAG, "on Create: started");


        fragmentManager=getSupportFragmentManager();
        back_button=(ImageView)findViewById(R.id.back_button);
        back_button.setOnClickListener(this);





        setupBottomNavigationView();
        FragmentTransaction ft=fragmentManager.beginTransaction();
        android.support.v4.app.Fragment firstFragment=new ProfileMainFragment();
        String tag = firstFragment.toString();
        ft.add(R.id.fragmenttest,firstFragment,tag);
        ft.commit();


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        super.onBackPressed();
    }
}
