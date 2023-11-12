package com.akash.design.lld.strategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    void drive() {
        driveStrategy.drive();;
    }
}
