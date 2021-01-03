package com.ztz.designpatterns.simpleFactory;

public class ProductClient  implements  AbstractFactory{
    @Override
    public Product makeProduct() {
        return new ProductOne();
    }
}