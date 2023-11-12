package com.akash.design.lld.designpatterns.observer;

public class PhoneAlertObserverImpl implements NotificationAlertObserver {
    StocksObservable observable;

    String phone;

    public PhoneAlertObserverImpl(StocksObservable observable, String phone) {
        this.observable = observable;
        this.phone = phone;
    }

    @Override
    public void update() {
        System.out.println("Phone: " + phone + " Stock: " + observable.getStock());
    }
}
