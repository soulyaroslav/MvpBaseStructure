package com.soulyaroslav.mvpbasestructure.manager.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.concurrent.Callable;

import rx.Observable;

/**
 * Created by yaroslav on 8/10/17.
 */

public class PreferenceManager {

    private SharedPreferences preferences;

    public PreferenceManager(final Context context, String preferenceName) {
        preferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
    }

    public void putString(String key, String value) {
        preferences.edit().putString(key, value).apply();
    }

    public void putInt(String key, int value) {
        preferences.edit().putInt(key, value).apply();
    }

    public void putFloat(String key, float value) {
        preferences.edit().putFloat(key, value).apply();
    }

    public void putLong(String key, long value) {
        preferences.edit().putLong(key, value).apply();
    }

    public void putBoolean(String key, String value) {
        preferences.edit().putString(key, value).apply();
    }

    public Observable<String> getString(final String key, final String def) {
        return Observable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return preferences.getString(key, def);
            }
        });
    }

    public Observable<Integer> getInt(final String key, final int def) {
        return Observable.fromCallable(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return preferences.getInt(key, def);
            }
        });
    }

    public Observable<Float> getFloat(final String key, final float def) {
        return Observable.fromCallable(new Callable<Float>() {
            @Override
            public Float call() throws Exception {
                return preferences.getFloat(key, def);
            }
        });
    }

    public Observable<Long> getLong(final String key, final long def) {
        return Observable.fromCallable(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return preferences.getLong(key, def);
            }
        });
    }

    public Observable<Boolean> getBoolean(final String key, final boolean def) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return preferences.getBoolean(key, def);
            }
        });
    }
}
