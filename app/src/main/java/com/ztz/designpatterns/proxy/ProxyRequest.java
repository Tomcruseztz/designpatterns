package com.ztz.designpatterns.proxy;

public class ProxyRequest  implements  proxy{

    private SimpleRequest simpleRequest=new SimpleRequest();

    @Override
    public void preRequest() {
        simpleRequest.preRequest();

    }

    public void preVoiusRequest(){
        System.out.println("preVoiusRequest is clonlused");

    }

    public void postRequest(){
        System.out.println("postRequest is clonlused");
    }
}