package com.ztz.designpatterns.simpleFactory;

public class ProductTwo implements  Product {
    @Override
    public void show() {
        System.out.println("product two"+getClass().getName());
    }
}