package com.example.pingoui.dronality;

/**
 * Created by pingoui on 16.04.2018.
 */

public class Post {

    private String name;
    private int noLikes,noDisLikes;

    public void Post(String name, int i, int j){
        this.name=name;
        noLikes=i;
        noDisLikes=j;
    }
}
