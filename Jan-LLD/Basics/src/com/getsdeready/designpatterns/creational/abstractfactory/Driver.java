package com.getsdeready.designpatterns.creational.abstractfactory;

import com.getsdeready.design.creational.abstractfactory.factory.PizzaFactory;
import com.getsdeready.design.creational.abstractfactory.pizza.Pizza;
import com.getsdeready.design.creational.abstractfactory.pizza.PizzaType;

public class Driver {

    public static void main(String[] args) {

        FactoryProvider factoryProvider = new FactoryProvider();

        PizzaFactory dominosFactory =
                factoryProvider.getPizzaFactory(PizzaFactoryType.DOMINOS);

        PizzaFactory pizzaHutFactory =
                factoryProvider.getPizzaFactory(PizzaFactoryType.PIZZA_HUT);

        Pizza pizza1 = dominosFactory.getPizza(PizzaType.VEGGIE);
        Pizza pizza2 = dominosFactory.getPizza(PizzaType.MARGERITA);

        Pizza pizza3 = pizzaHutFactory.getPizza(PizzaType.VEGGIE);
        Pizza pizza4 = pizzaHutFactory.getPizza(PizzaType.MARGERITA);

        System.out.println(pizza1.getName());
        System.out.println(pizza2.getName());
        System.out.println(pizza3.getName());
        System.out.println(pizza4.getName());
    }
}
