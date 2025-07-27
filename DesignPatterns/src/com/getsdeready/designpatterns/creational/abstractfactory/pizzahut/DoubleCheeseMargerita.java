package com.getsdeready.designpatterns.creational.abstractfactory.pizzahut;

import com.getsdeready.designpatterns.creational.abstractfactory.IPizza;

public class DoubleCheeseMargerita implements IPizza {
    @Override
    public String getName() {
        return "DoubleCheeseMargerita";
    }
}
