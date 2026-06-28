package com.getsdeready.lld.basics.designpatterns.structural.decorator.violation;

public class CheeseBurstPlainPizza extends Pizza {

    @Override
    public String getName() {
        return "Cheese Burst Plain Pizza";
    }

    @Override
    public double getCost() {
        return 15.0;
    }
}
