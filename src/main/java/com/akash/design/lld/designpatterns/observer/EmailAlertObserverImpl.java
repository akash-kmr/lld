package com.akash.design.lld.designpatterns.observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private StocksObservable observable;

    String email;

    public EmailAlertObserverImpl(StocksObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email: " + email + " Stock: " + observable.getStock());
    }

}
