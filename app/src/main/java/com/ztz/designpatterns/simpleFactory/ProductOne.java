package com.ztz.designpatterns.simpleFactory;

public class ProductOne implements Product {
    @Override
    public void show() {
        System.out.println("product one"+getClass().getName());
    }
}