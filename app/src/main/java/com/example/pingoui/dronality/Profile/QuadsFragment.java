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

import static android.support.v7.widget.RecyclerView.HORIZONTAL;

/**
 * Created by pingoui on 29.03.2018.
 */

public class QuadsFragment extends Fragment {
    private static final String TAG = "Commons_Fragment";
    ArrayList<Quad> quads;
    Context mContex;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_quads, container, false);
        mContex=getContext();



        RecyclerView drones = (RecyclerView) view.findViewById(R.id.rvQuads);



         quads= Quad.createContactsList(3);
        // Create adapter passing in the sample user data
        QuadsRowAdapter adapter = new QuadsRowAdapter(mContex, quads);
        // Attach the adapter to the recyclerview to populate items
        drones.setAdapter(adapter);
        // Set layout manager to position the items
        drones.setLayoutManager(new LinearLayoutManager(mContex));

        DividerItemDecoration itemDecor = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        drones.addItemDecoration(itemDecor);

        return view;
    }
}