package com.noscale.ecashier.utilities;

import java.util.prefs.Preferences;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class ECPreferences {

    private static final String ECP_PREFERECES = "EP_PREFERECES";
    private static ECPreferences instance;
    private Preferences pref;

    public static ECPreferences getInstance() {

        if (null == instance) {
            instance = new ECPreferences();
        }

        return instance;
    }

    public ECPreferences() {
        pref = Preferences.userRoot().node(ECP_PREFERECES);
    }

    public void putString(String key, String value) {

        pref.put(key,value);

    }

    public String getString(String key, String defValue) {
        return pref.get(key,defValue);
    }

    public void putBoolean(String key, boolean isValue) {

        pref.putBoolean(key, isValue);

    }

    public boolean getBoolean(String key, boolean isDefValue) {
        return pref.getBoolean(key, isDefValue);
    }

    public void putInt(String key, int value) {

        pref.putInt(key, value);

    }

    public int getInt(String key, int defValue) {

        return pref.getInt(key, defValue);

    }

}
