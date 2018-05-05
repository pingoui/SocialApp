package com.example.pingoui.dronality.Profile;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.example.pingoui.dronality.R;

/**
 * Created by pingoui on 29.03.2018.
 */

public class ProfileMainFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    private static final String TAG = "ProfileMain_Fragment";

    android.support.v4.app.Fragment secondFragment, cardFragment;

    String tag2;

    ImageView quads_button, commons_button, post_button, geo_button;

    FragmentManager fm;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_profile_main, container, false);

        quads_button=(ImageView)view.findViewById(R.id.fragment_quads_icon);
        commons_button=(ImageView)view.findViewById(R.id.fragment_commons_icon);
        post_button=(ImageView)view.findViewById(R.id.fragment_post_icon);
        geo_button=(ImageView)view.findViewById(R.id.fragment_geo_icon);

        quads_button.setOnClickListener(this);
        commons_button.setOnClickListener(this);
        post_button.setOnClickListener(this);
        geo_button.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {

        fm = getActivity().getSupportFragmentManager();

            switch (view.getId()) {
                case R.id.fragment_quads_icon:
                    secondFragment = new QuadsFragment();
                    tag2 = secondFragment.toString();
                    break;

                case R.id.fragment_commons_icon:
                    secondFragment = new CommonsFragment();
                    tag2 = secondFragment.toString();
                    break;

                case R.id.fragment_geo_icon:
                    secondFragment = new GeoFragment();
                    tag2 = secondFragment.toString();
                    break;
                case R.id.fragment_post_icon:
                    secondFragment = new PostsFragment();
                    tag2 = secondFragment.toString();
                    break;
            }
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragmenttest,secondFragment,tag2);
            ft.addToBackStack(null);
            ft.commit();
        }




    }

