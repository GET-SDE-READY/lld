package com.getsdeready.lld.basics.designpatterns.structural.decorator.decoration;

import com.getsdeready.lld.basics.designpatterns.structural.decorator.IPizza;

// DECORATOR ABSTRACTION
public abstract class IPizzaDecorator implements IPizza {

    protected IPizza basePizza;

    public IPizzaDecorator(IPizza basePizza) {
        this.basePizza = basePizza;
    }
}
