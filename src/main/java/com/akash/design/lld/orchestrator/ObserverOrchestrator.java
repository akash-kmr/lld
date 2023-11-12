package com.akash.design.lld.orchestrator;

import com.akash.design.lld.designpatterns.observer.EmailAlertObserverImpl;
import com.akash.design.lld.designpatterns.observer.IphoneObservableImpl;
import com.akash.design.lld.designpatterns.observer.NotificationAlertObserver;
import com.akash.design.lld.designpatterns.observer.PhoneAlertObserverImpl;
import com.akash.design.lld.designpatterns.observer.StocksObservable;

public class ObserverOrchestrator implements Orchestrator {

    @Override
    public void run() {
        StocksObservable stocksObservable = new IphoneObservableImpl();
        stocksObservable.setStock(5);
        NotificationAlertObserver phObserver = new PhoneAlertObserverImpl(stocksObservable, "7091725303");
        NotificationAlertObserver emailObserver = new EmailAlertObserverImpl(stocksObservable, "bholuakku@gmail.com");
        stocksObservable.add(phObserver);
        stocksObservable.add(emailObserver);
        stocksObservable.notifyObservers();
        stocksObservable.setStock(112);
    }

}
