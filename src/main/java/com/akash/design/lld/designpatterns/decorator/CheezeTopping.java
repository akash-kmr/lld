package com.akash.design.lld.designpatterns.decorator;

public class CheezeTopping extends Topping {

    public CheezeTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        System.out.println("Cheeze Topping: 100");
        return 100 + basePizza.getPrice();
    }

}
