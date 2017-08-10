package com.soulyaroslav.mvpbasestructure.navigation;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by yaroslav on 7/12/17.
 */

public class AbstractBaseActivity  extends AppCompatActivity {

    private InputMethodManager inputMethodManager;
    private NavigationManager navigationManager;
    private NavigationBackManager navigationBackManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        navigationManager = new NavigationManager(this);
        // set container for fragments
//        navigationManager.setFragmentContainer(R.id.container);
        // by default use SupportFragmentManager
        navigationManager.setFragmentManager(getSupportFragmentManager());
        navigationBackManager = new NavigationBackManager(this, navigationManager);
    }

    @Override
    public void onBackPressed() {
        navigationBackManager.navigateBack();
    }

    public void hideKeyboard() {
        inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }

    public void showKeyboard(View view) {
        inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
    }

    public NavigationManager getNavigationManager() {
        return navigationManager;
    }

    public NavigationBackManager getNavigationBackManager() {
        return navigationBackManager;
    }
}
