package com.example.pingoui.dronality.Profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pingoui.dronality.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by pingoui on 01.04.2018.
 */

// Create the basic adapter extending from RecyclerView.Adapter

// Note that we specify the custom ViewHolder which gives us access to our views
public class QuadsRowAdapter extends
        RecyclerView.Adapter<QuadsRowAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View dronesView = inflater.inflate(R.layout.quads_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(dronesView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDrones.size();
    }



    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name, option1, option2, option3;
        ImageView photoButton, geoButton, specButton, quadView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.nameTV);
            option1 = (TextView) itemView.findViewById(R.id.photosTv);
            option2 = (TextView) itemView.findViewById(R.id.geoTV);
            option3 = (TextView) itemView.findViewById(R.id.specTV);
            quadView = (ImageView)itemView.findViewById(R.id.quadIV);
            photoButton = (ImageView)itemView.findViewById(R.id.postIV);
            geoButton = (ImageView)itemView.findViewById(R.id.geoIV);
            specButton = (ImageView)itemView.findViewById(R.id.specIV);


        }
    }
    private List<Quad> mDrones;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public QuadsRowAdapter(Context context, List<Quad> quads) {
        mDrones = quads;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }
}