package com.ztz.designpatterns.singleTon;

public class HungrySingleTon {

    private static  final HungrySingleTon hungrySingleTon=new HungrySingleTon();



    public static  HungrySingleTon getInstance(){
        return  hungrySingleTon;
    }
}