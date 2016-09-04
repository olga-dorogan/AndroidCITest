package com.example.olga.gus.presentation.base;

/**
 * Created by olga on 02.09.16.
 */
public interface MvpPresenter<T extends MvpView> {
    void attachView(T view);
    void detachView();
}
