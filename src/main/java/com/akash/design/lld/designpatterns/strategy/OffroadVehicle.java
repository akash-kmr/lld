package com.akash.design.lld.designpatterns.strategy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDrive());
    }

}
