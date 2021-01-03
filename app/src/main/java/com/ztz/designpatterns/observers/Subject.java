package com.ztz.designpatterns.observers;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers=new ArrayList<>();


    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void removeObservers(Observer observer){
        observers.remove(observer);
    }



    public abstract  void notifyObserver();
}