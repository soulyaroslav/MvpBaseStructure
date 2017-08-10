package com.soulyaroslav.mvpbasestructure.navigation.builder;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;

import com.soulyaroslav.mvpbasestructure.navigation.AnimationType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaroslav on 6/26/17.
 */

public class ActivityBuilder {
    private Class<?> screen;
    private Bundle bundle;
    private boolean isActivityRoot;
    private AnimationType animationType;
    private boolean isTransitionAnimation;
    private List<Pair<View, String>> transitionViews;

    public ActivityBuilder() {
        // empty constructor
        transitionViews = new ArrayList<>();
    }

    public ActivityBuilder setScreen(Class<?> screen) {
        this.screen = screen;
        return this;
    }

    public ActivityBuilder setBundle(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }

    public ActivityBuilder setActivityRoot(boolean isActivityRoot) {
        this.isActivityRoot = isActivityRoot;
        return this;
    }

    public ActivityBuilder setAnimationType(AnimationType animationType) {
        this.animationType = animationType;
        return this;
    }

    public ActivityBuilder isTranstionAnimation(boolean isTransitionAnimation) {
        this.isTransitionAnimation = isTransitionAnimation;
        return this;
    }

    public ActivityBuilder addTransitionView(View transitionView, String transitionName) {
        if(isTransitionAnimation) {
            transitionViews.add(new Pair<>(transitionView, transitionName));
        }
        return this;
    }

    public ActivityPreference build() {
        return new ActivityPreference(screen, bundle, isActivityRoot, animationType, isTransitionAnimation, transitionViews);
    }
}
