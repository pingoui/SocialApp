package com.example.pingoui.dronality.Profile;

import java.util.ArrayList;

/**
 * Created by pingoui on 01.04.2018.
 */

public class Quad {

        private String mName;
        private boolean mOnline;

        public Quad(String name, boolean online) {
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

        public static ArrayList<Quad> createContactsList(int numContacts) {
            ArrayList<Quad> contacts = new ArrayList<Quad>();

            for (int i = 1; i <= numContacts; i++) {
                contacts.add(new Quad("Person " + ++lastContactId, i <= numContacts / 2));
            }

            return contacts;
        }

}
