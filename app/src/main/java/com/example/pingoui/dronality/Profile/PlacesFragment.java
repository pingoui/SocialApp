package com.example.pingoui.dronality.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pingoui.dronality.R;

/**
 * Created by pingoui on 29.03.2018.
 */

public class PlacesFragment extends Fragment{
    private static final String TAG = "Commons_Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_profile_geo, container, false);
        return view;
    }
}
