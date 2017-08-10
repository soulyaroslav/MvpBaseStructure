package com.soulyaroslav.mvpbasestructure.navigation;

import com.soulyaroslav.mvpbasestructure.navigation.builder.ActivityPreference;
import com.soulyaroslav.mvpbasestructure.navigation.builder.FragmentPreference;

/**
 * Created by yaroslav on 4/12/17.
 */

public interface NavigationController {
    void navigateTo(ActivityPreference activityPreference);
    void navigateTo(FragmentPreference fragmentPreference);
}
