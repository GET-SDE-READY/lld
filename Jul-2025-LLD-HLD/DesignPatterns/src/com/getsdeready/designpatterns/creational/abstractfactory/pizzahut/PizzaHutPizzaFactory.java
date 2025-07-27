package com.getsdeready.designpatterns.creational.abstractfactory.pizzahut;

import com.getsdeready.designpatterns.creational.abstractfactory.IPizza;
import com.getsdeready.designpatterns.creational.abstractfactory.IPizzaFactory;
import com.getsdeready.designpatterns.creational.abstractfactory.PizzaType;

public class PizzaHutPizzaFactory implements IPizzaFactory {

    // preferred
    public IPizza getPizza(PizzaType type) {
        return switch (type) {
            case VEG -> new VegExtravaganza();
            case MARGERITA -> new DoubleCheeseMargerita();
            default -> throw new RuntimeException("Pizza Type not supported");
        };
    }
}
