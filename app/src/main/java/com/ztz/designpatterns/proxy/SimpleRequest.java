package com.ztz.designpatterns.proxy;

public class SimpleRequest implements proxy{
    @Override
    public void preRequest() {
        System.out.println("SimpleRequest is preRequest");
    }
}