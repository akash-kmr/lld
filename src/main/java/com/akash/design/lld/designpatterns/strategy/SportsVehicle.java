package com.akash.design.lld.designpatterns.strategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SpecialDrive());
    }

}
