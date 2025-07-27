package com.getsdeready.designpatterns.creational.abstractfactory.pizzahut;

import com.getsdeready.designpatterns.creational.abstractfactory.IPizza;

public class VegExtravaganza implements IPizza {

    @Override
    public String getName() {
        return "Veggie Extravaganza";
    }
}
