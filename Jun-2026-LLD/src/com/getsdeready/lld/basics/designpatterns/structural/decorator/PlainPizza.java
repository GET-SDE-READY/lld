package com.getsdeready.lld.basics.designpatterns.structural.decorator;

// CONCRETE COMPONENT
public class PlainPizza implements IPizza {
    @Override
    public String getName() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
