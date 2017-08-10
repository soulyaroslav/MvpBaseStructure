package com.soulyaroslav.mvpbasestructure.navigation.builder;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;

import com.soulyaroslav.mvpbasestructure.navigation.AnimationType;

import java.util.List;


/**
 * Created by yaroslav on 6/26/17.
 */

public class ActivityPreference {
    private Class<?> screen;
    private Bundle bundle;
    private boolean isActivityRoot;
    private AnimationType animationType;
    private boolean isTransitionAnimation;
    private List<Pair<View, String>> transitionViews;

    public ActivityPreference(Class<?> screen, Bundle bundle, boolean isActivityRoot,
                              AnimationType animationType, boolean isTransitionAnimation, List<Pair<View, String>> transitionViews) {
        this.screen = screen;
        this.bundle = bundle;
        this.isActivityRoot = isActivityRoot;
        this.animationType = animationType;
        this.isTransitionAnimation = isTransitionAnimation;
        this.transitionViews = transitionViews;
    }

    public Class<?> getScreen() {
        return screen;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public boolean isActivityRoot() {
        return isActivityRoot;
    }

    public AnimationType getAnimationType() {
        return animationType;
    }

    public boolean isTransitionAnimation() {
        return isTransitionAnimation;
    }

    public List<Pair<View, String>> getTransitionViews() {
        return transitionViews;
    }
}
