package com.getsdeready.designpatterns.structural.decorator;

public class VeggieBurger implements Burger {
    @Override
    public String getDescription() {
        return "Veggie Burger";
    }

    @Override
    public Double getCost() {
        return 70.0;
    }
}
