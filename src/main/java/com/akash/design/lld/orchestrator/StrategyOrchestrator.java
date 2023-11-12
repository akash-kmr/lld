package com.akash.design.lld.orchestrator;

import com.akash.design.lld.designpatterns.strategy.OffroadVehicle;
import com.akash.design.lld.designpatterns.strategy.PassangerVehicle;
import com.akash.design.lld.designpatterns.strategy.SportsVehicle;
import com.akash.design.lld.designpatterns.strategy.Vehicle;

public class StrategyOrchestrator implements Orchestrator {
    public void run() {
        Vehicle v = new SportsVehicle();
		v.drive();
		v = new PassangerVehicle();
		v.drive();
		v = new OffroadVehicle();
		v.drive();
    }
}
