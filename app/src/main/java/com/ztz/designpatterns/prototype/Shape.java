package com.ztz.designpatterns.prototype;

public interface Shape  extends Cloneable{

    Object clone();

    double countArea(int r);



}