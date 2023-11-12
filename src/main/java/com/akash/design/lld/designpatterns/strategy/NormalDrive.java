package com.akash.design.lld.designpatterns.strategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }

}
