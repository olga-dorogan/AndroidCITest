package com.example.olga.gus.presentation.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by olga on 02.09.16.
 */
public class BasePresenter<T extends MvpView> implements MvpPresenter<T> {
    private T view;
    private CompositeSubscription subscription = new CompositeSubscription();

    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        subscription.clear();
        this.view = null;
    }

    public T getView() {
        return view;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MvpViewNotAttachedException();
        }
    }

    private boolean isViewAttached() {
        return view != null;
    }

    protected void addSubscription(Subscription subscription) {
        this.subscription.add(subscription);
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" + " requesting data to the Presenter");
        }
    }
}
