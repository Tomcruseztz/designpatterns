package com.ztz.designpatterns.singleTon;

public class LazySingleTon {
    private static  LazySingleTon lazySingleTon=null;


    public static  synchronized  LazySingleTon  getInstance(){
        if (lazySingleTon==null){
            lazySingleTon=new LazySingleTon();
        }
        return  lazySingleTon;
    }

}