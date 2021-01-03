package com.ztz.designpatterns.prototype;

import java.util.concurrent.ConcurrentHashMap;

public class ProtoTypePatterns {

    private ConcurrentHashMap<String,Shape> map=new ConcurrentHashMap<>();



    public void addShape(Shape shape ){
        map.put(shape.getClass().getName(),shape);

    }


    public Shape getShape(Class<?> clzz){
        if (map.get(clzz.getName())==null){
            try {
                return (Shape) clzz.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

        return map.get(clzz.getName());
    }






}
