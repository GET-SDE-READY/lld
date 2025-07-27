package com.getsdeready.designpatterns.creational.abstractfactory.dominos;

import com.getsdeready.designpatterns.creational.abstractfactory.IPizza;

public class VeggieParadisePizza implements IPizza {
    @Override
    public String getName() {
        return "Veggie Paradise Pizza";
    }
}
