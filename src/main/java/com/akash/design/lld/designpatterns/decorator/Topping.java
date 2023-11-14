package com.akash.design.lld.designpatterns.decorator;

public abstract class Topping extends BasePizza {

    protected BasePizza basePizza;

    protected Topping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
