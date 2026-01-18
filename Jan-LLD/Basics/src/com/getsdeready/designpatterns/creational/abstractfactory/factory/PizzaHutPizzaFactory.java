package com.getsdeready.designpatterns.creational.abstractfactory.factory;

import com.getsdeready.design.creational.abstractfactory.pizza.*;

public class PizzaHutPizzaFactory implements PizzaFactory {
    @Override
    public Pizza getPizza(PizzaType type) {
        return switch (type) {
            case VEGGIE -> new VeggieParadisePizza();
            case MARGERITA -> new DoubleCheeseMargerita();
        };
    }
}
