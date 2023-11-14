package com.akash.design.lld.designpatterns.decorator;

public class VegDelightBase extends BasePizza {

    @Override
    public int getPrice() {
        System.out.println("Veg Delight Base: 300");
        return 300;
    }

}
