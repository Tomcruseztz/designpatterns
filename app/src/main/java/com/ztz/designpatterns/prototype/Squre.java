package com.ztz.designpatterns.prototype;

public class Squre  implements Shape{
    @Override
    public Object clone() {
        Squre squre=null;
        try {
            squre= (Squre) super.clone();
        } catch (CloneNotSupportedException e) {
           System.out.println("clone not support here ");
        }
        return squre;
    }

    @Override
    public double countArea(int r) {
        return r*r;
    }
}