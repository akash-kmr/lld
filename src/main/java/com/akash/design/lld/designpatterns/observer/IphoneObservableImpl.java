package com.akash.design.lld.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    int stock;

    private List<NotificationAlertObserver> observersList;

    public IphoneObservableImpl() {
        observersList = new ArrayList<>();
        stock = 0;
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observersList) observer.update();
    }

    @Override
    public void setStock(int stock) {
        if (this.stock != stock) {
            this.stock = stock;
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return stock;
    }

}
