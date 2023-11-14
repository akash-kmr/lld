package com.akash.design.lld.designpatterns.decorator;

public class MushroomTopping extends Topping {

    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        System.out.println("Mushroom Topping: 150");
        return 150 + basePizza.getPrice();
    }

}
