package com.getsdeready.designpatterns.creational.abstractfactory;

import com.getsdeready.design.creational.abstractfactory.factory.DominosPizzaFactory;
import com.getsdeready.design.creational.abstractfactory.factory.PizzaFactory;
import com.getsdeready.design.creational.abstractfactory.factory.PizzaHutPizzaFactory;

public class FactoryProvider {

    public PizzaFactory getPizzaFactory(PizzaFactoryType type) {
        return switch (type) {
            case DOMINOS -> new DominosPizzaFactory();
            case PIZZA_HUT -> new PizzaHutPizzaFactory();
        };
    }
}
