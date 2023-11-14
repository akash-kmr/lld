package com.akash.design.lld.orchestrator;

import com.akash.design.lld.designpatterns.decorator.BasePizza;
import com.akash.design.lld.designpatterns.decorator.CheezeTopping;
import com.akash.design.lld.designpatterns.decorator.MargheritaBase;
import com.akash.design.lld.designpatterns.decorator.MushroomTopping;
import com.akash.design.lld.designpatterns.decorator.VegDelightBase;

public class DecoratorOrchestrator implements Orchestrator {

    @Override
    public void run() {
        BasePizza doubleCheezeSingleMushroomVegDelightPizza = new CheezeTopping(new CheezeTopping(new MushroomTopping(new VegDelightBase())));
        BasePizza singleCheezeDoubleMushroomMargheritaPizza = new CheezeTopping(new MushroomTopping(new MushroomTopping(new MargheritaBase())));
        System.out.println("Total: " + doubleCheezeSingleMushroomVegDelightPizza.getPrice());
        System.out.println("Total: " + singleCheezeDoubleMushroomMargheritaPizza.getPrice());
    }

}
