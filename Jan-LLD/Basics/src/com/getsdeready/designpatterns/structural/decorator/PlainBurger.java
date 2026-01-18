package com.getsdeready.designpatterns.structural.decorator;

public class PlainBurger implements Burger {
    @Override
    public String getDescription() {
        return "Plain Burger";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}
