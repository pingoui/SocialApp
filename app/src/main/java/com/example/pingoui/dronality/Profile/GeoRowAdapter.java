package com.example.pingoui.dronality.Profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pingoui.dronality.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pingoui on 10.04.2018.
 */

public class GeoRowAdapter extends RecyclerView.Adapter<GeoRowAdapter.ViewHolder> {


    @Override
    public GeoRowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View geoView = inflater.inflate(R.layout.geo_row, parent, false);

        // Return a new holder instance
        GeoRowAdapter.ViewHolder viewHolder = new GeoRowAdapter.ViewHolder(geoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GeoRowAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mGeo.size();
    }



    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name, lat,lon,date;
        ImageView geoMap;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.location_name);
            lat= (TextView) itemView.findViewById(R.id.location_gps_lat);
            lon = (TextView) itemView.findViewById(R.id.location_gps_lon);
            date = (TextView) itemView.findViewById(R.id.location_date);
            geoMap = (ImageView)itemView.findViewById(R.id.geoImage);



        }
    }
    private List<Geo> mGeo;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public GeoRowAdapter(Context context, ArrayList<Geo> geo) {
        mGeo = geo;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }
}
