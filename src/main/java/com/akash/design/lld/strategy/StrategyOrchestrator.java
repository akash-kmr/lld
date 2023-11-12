package com.akash.design.lld.strategy;

public class StrategyOrchestrator {
    public static void run() {
        Vehicle v = new SportsVehicle();
		v.drive();
		v = new PassangerVehicle();
		v.drive();
		v = new OffroadVehicle();
		v.drive();
    }
}
