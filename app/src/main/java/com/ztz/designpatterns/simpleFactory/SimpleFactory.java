package com.ztz.designpatterns.simpleFactory;

public class SimpleFactory {


    static final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }


    public static  Product  makeProduct(int kind){
        Product product=null;
        switch (kind){
            case Const.PRODUCT_A:
                product=new ProductOne();
                break;
            case Const.PRODUCT_B:
                product=new ProductTwo();
                break;
        }
        return  product;

    }
}