package com.example.pingoui.dronality.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pingoui.dronality.R;

import java.util.ArrayList;

/**
 * Created by pingoui on 10.04.2018.
 */

public class GeoFragment extends Fragment {
    private static final String TAG = "Commons_Fragment";
    ArrayList<Geo> geos;
    Context mContex;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_profile_geo, container, false);
        mContex=getContext();



        RecyclerView geo = (RecyclerView) view.findViewById(R.id.rvGeo);



        geos= Geo.createContactsList(5);
        // Create adapter passing in the sample user data
        GeoRowAdapter adapter = new GeoRowAdapter(mContex, geos);
        // Attach the adapter to the recyclerview to populate items
        geo.setAdapter(adapter);
        // Set layout manager to position the items
        geo.setLayoutManager(new LinearLayoutManager(mContex));

        DividerItemDecoration itemDecor = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        geo.addItemDecoration(itemDecor);

        return view;
    }
}
