package com.example.pingoui.dronality.Profile;

/**
 * Created by pingoui on 11.04.2018.
 */

public class User {

    public String name;
    public int followers, followed;
    public int noPosts, noFlips, noFalls, noGeo, noDrones;

    public User(int followers,int  followed,int  noPosts,int noFlips,int  noFalls,int noGeo,int noDrones){
        this.followers=followers;
        this.followed=followed;
        this.noPosts=noPosts;
        this.noFlips=noFlips;
        this.noFalls=noFalls;
        this.noDrones=noDrones;
    }
}
