package com.getsdeready.designpatterns.creational.abstractfactory;

import com.getsdeready.designpatterns.creational.abstractfactory.dominos.DominosPizzaFactory;
import com.getsdeready.designpatterns.creational.abstractfactory.pizzahut.PizzaHutPizzaFactory;


// factory for Pizza Factory
public class FactoryProvider {

    public static IPizzaFactory getPizzaFactory(PizzaFactoryType type) {
        return switch (type) {
            case DOMINOS -> new DominosPizzaFactory();
            case PIZZA_HUT -> new PizzaHutPizzaFactory();
        };
    }
}
