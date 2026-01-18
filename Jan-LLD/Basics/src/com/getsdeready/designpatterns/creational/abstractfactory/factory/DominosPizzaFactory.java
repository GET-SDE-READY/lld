package com.getsdeready.designpatterns.creational.abstractfactory.factory;

import com.getsdeready.design.creational.abstractfactory.pizza.MargeritaPizza;
import com.getsdeready.design.creational.abstractfactory.pizza.Pizza;
import com.getsdeready.design.creational.abstractfactory.pizza.PizzaType;
import com.getsdeready.design.creational.abstractfactory.pizza.VeggiePizza;

public class DominosPizzaFactory implements PizzaFactory {

    @Override
    public Pizza getPizza(PizzaType type) {
        return switch (type) {
            case VEGGIE -> new VeggiePizza();
            case MARGERITA -> new MargeritaPizza();
        };

    }
}
