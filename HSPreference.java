package com.hstelnet.rayhome2.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Example
 *   Global.java (Application Context)
 *   HSPreference hsPreference = new HSPreference(this);
 * 
 *   global.hsPreference.addPreference(HSPreference.PREFERENCE_LATEST_OPENED_DEVICE, "");
 *   String str = global.hsPreference.getStringFromPreference(HSPreference.PREFERENCE_LATEST_OPENED_DEVICE);
 * **/

public class HSPreference {
    //Preference
    private static final String PREFERENCE_NAME = "HSPREFS";
    private SharedPreferences prefs;

    //Preference Key Strings
    public static final String PREFERENCE_KEY_UUID = "phoneuuid";
    public static final String PREFERENCE_LATEST_OPENED_DEVICE = "cseid_of_latest_opened_device";
    public static final String PREFERENCE_DETAIL_HEIGHT_DEVICE = "detail_height_of_device";

    //Variable
    private String uuid;

    public HSPreference(Context context) {
        //Load
        prefs = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }


    //add Methods
    @SuppressLint("ApplySharedPref")
    public void addPreference(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }
    @SuppressLint("ApplySharedPref")
    public void addPreference(String key, int value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.commit();
    }
    @SuppressLint("ApplySharedPref")
    public void addPreference(String key, boolean value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    @SuppressLint("ApplySharedPref")
    public void addPreference(String key, float value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    //get Methods
    public boolean contains(String key) { return prefs.contains(key); }

    public String getStringFromPreference(String key) {
        return prefs.getString(key, "");
    }

    public int getIntFromPreference(String key) {
        return prefs.getInt(key, 0);
    }

    public boolean getBooleanFromPreference(String key) {
        return prefs.getBoolean(key, false);
    }

    public float getFloatFromPreference(String key) {
        return prefs.getFloat(key, 0.0f);
    }
}
