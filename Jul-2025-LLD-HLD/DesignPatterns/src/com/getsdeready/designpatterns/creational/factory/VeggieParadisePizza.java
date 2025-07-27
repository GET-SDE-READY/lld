package com.getsdeready.designpatterns.creational.factory;

public class VeggieParadisePizza implements IPizza, Cloneable {
    @Override
    public String getName() {
        return "Veggie Paradise Pizza";
    }
}
