package com.ztz.designpatterns.observers;

public class ConcreteObserver  implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver  update");
    }
}