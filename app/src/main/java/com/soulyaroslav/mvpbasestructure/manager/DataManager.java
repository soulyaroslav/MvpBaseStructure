package com.soulyaroslav.mvpbasestructure.manager;

import android.content.Context;

import com.soulyaroslav.mvpbasestructure.manager.preference.PreferenceManager;

/**
 * Created by yaroslav on 8/10/17.
 */

public class DataManager {

    private PreferenceManager preferenceManager;

    public DataManager(final Context context) {
        preferenceManager = new PreferenceManager(context, "test");
    }

    public PreferenceManager getPreferenceManager() {
        return preferenceManager;
    }
}
