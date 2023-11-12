package com.akash.design.lld.designpatterns.observer;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStock(int stock);
    int getStock();
}
