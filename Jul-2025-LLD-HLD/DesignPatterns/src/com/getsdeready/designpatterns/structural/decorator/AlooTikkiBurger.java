package com.getsdeready.designpatterns.structural.decorator;

public class AlooTikkiBurger implements Burger {
    @Override
    public String getDescription() {
        return "Aloo Tikki Burger";
    }

    @Override
    public Double getCost() {
        return 40.0;
    }
}
