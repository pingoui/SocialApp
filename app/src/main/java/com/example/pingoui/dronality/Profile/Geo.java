package com.example.pingoui.dronality.Profile;

import java.util.ArrayList;

/**
 * Created by pingoui on 10.04.2018.
 */

public class Geo {

    private String mName;
    private boolean mOnline;

    public Geo(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Geo> createContactsList(int numContacts) {
        ArrayList<Geo> contacts = new ArrayList<Geo>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Geo("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }

}
