package com.ztz.designpatterns.prototype;

import java.util.Locale;

public class Circle implements Shape {


    @Override
    public Object clone() {
        Circle circle=null;
        try {
            circle= (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("clone not support here exception");
        }
        return circle;
    }

    @Override
    public double countArea(int r) {
        double area=Math.PI*r*r;
        System.out.println(String.format(Locale.CHINA,"circle area is %s",area));
        return  area;

    }
}