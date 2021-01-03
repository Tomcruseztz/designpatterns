package com.ztz.designpatterns.observers;


public class ConstrictSubject  extends Subject{
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}