package com.akash.design.lld;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akash.design.lld.orchestrator.DecoratorOrchestrator;
import com.akash.design.lld.orchestrator.ObserverOrchestrator;
import com.akash.design.lld.orchestrator.Orchestrator;
import com.akash.design.lld.orchestrator.StrategyOrchestrator;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LldApplication.class, args);
		Orchestrator orchestrator = new DecoratorOrchestrator();
		orchestrator.run();
	}

}
