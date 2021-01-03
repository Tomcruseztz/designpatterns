package com.ztz.designpatterns.singleTon;

public class VoliteSingleTon {

    private volatile  static  VoliteSingleTon voliteSingleTon=null;


    public  static  VoliteSingleTon getInstance(){
        if (voliteSingleTon==null){
            synchronized (VoliteSingleTon.class){
                if (voliteSingleTon==null){
                    voliteSingleTon=new VoliteSingleTon();
                }
            }
        }
        return voliteSingleTon;
    }



    public static  VoliteSingleTon getVoliteSingleTon(){
        return  singleHolder.voliteSingleTon;
    }


    private static  class singleHolder{
        public static  VoliteSingleTon voliteSingleTon=new VoliteSingleTon();

    }
}