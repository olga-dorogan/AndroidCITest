package com.example.olga.gus.presentation.search;

import com.example.olga.gus.data.remote.model.User;
import com.example.olga.gus.presentation.base.MvpPresenter;
import com.example.olga.gus.presentation.base.MvpView;

import java.util.List;

/**
 * Created by olga on 02.09.16.
 */
public interface UserSearchContract {
    interface View extends MvpView {
        void showSearchResults(List<User> githubUserList);

        void showError(String message);

        void showLoading();

        void hideLoading();
    }

    interface Presenter extends MvpPresenter<View> {
        void search(String term);
    }
}
