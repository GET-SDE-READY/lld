package com.getsdeready.designpatterns.creational.factory;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        this.name = "Veggie Pizza";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
