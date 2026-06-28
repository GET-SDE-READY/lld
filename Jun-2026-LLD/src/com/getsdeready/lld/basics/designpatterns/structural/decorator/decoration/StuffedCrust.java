package com.getsdeready.lld.basics.designpatterns.structural.decorator.decoration;

import com.getsdeready.lld.basics.designpatterns.structural.decorator.IPizza;

// CONCRETE DECORATOR
public class StuffedCrust extends IPizzaDecorator {

    public StuffedCrust(IPizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getName() {
        return String.join(" ", "Stuffed Crust", this.basePizza.getName());
    }

    @Override
    public double getCost() {
        return 3.0 + this.basePizza.getCost();
    }
}
