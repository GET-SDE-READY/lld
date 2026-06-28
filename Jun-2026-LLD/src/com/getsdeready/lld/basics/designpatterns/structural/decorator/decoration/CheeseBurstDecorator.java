package com.getsdeready.lld.basics.designpatterns.structural.decorator.decoration;

import com.getsdeready.lld.basics.designpatterns.structural.decorator.IPizza;

// CONCRETE DECORATOR
public class CheeseBurstDecorator extends IPizzaDecorator {

    public CheeseBurstDecorator(IPizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getName() {
        return String.join(" ", "Cheese Burst", this.basePizza.getName());
    }

    @Override
    public double getCost() {
        return 5.0 + this.basePizza.getCost();
    }
}
