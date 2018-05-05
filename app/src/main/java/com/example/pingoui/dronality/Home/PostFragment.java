package com.example.pingoui.dronality.Home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pingoui.dronality.R;

/**
 * Created by pingoui on 16.04.2018.
 */

public class PostFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.post_row, container, false);

        return rootView;
    }

}
