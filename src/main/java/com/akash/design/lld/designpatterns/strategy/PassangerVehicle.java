package com.akash.design.lld.designpatterns.strategy;

public class PassangerVehicle extends Vehicle {

    public PassangerVehicle() {
        super(new NormalDrive());
    }

}
