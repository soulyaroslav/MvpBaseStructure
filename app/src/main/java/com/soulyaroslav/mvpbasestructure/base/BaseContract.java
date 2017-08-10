package com.soulyaroslav.mvpbasestructure.base;

/**
 * Created by yaroslav on 8/10/17.
 */

public interface BaseContract {
    interface BaseView {
        void showProgress();
        void hideProgress();
    }

    interface Presenter<V extends BaseView>{
        void attachView(V view);
        void detachView();
    }
}
