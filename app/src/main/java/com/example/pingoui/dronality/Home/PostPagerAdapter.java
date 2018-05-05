package com.example.pingoui.dronality.Home;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.pingoui.dronality.Profile.PostsFragment;
import com.example.pingoui.dronality.R;

/**
 * Created by pingoui on 16.04.2018.
 */

public class PostPagerAdapter extends PagerAdapter {
    Context mContext;

    public PostPagerAdapter(Context mContext){
        this.mContext=mContext;
    }




    int[] layouts={R.layout.post_item_info, R.layout.post_item_post, R.layout.post_item_geo};
    LayoutInflater mLayoutInflater;

    @Override
    public int getCount() {
        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View info = mLayoutInflater.inflate(R.layout.post_item_info, container, false);
        View geo = mLayoutInflater.inflate(R.layout.post_item_geo, container,false);
        View post=mLayoutInflater.inflate(R.layout.post_item_post,container,false);
        View[] viewarr={info,geo,post};
        container.addView(viewarr[position]);
        return viewarr[position];
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}