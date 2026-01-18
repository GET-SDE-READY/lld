package com.getsdeready.designpatterns.creational.factory.client;

import com.getsdeready.design.creational.factory.server.Pizza;
import com.getsdeready.design.creational.factory.server.PizzaFactory;
import com.getsdeready.design.creational.factory.server.PizzaType;
import com.getsdeready.design.creational.factory.server.VeggiePizza;

public class Driver {

    public static void main(String[] args) {

        // tight coupling on client side
        // if the class is discontinued, client will
        // have to change code
        Pizza veggiePizza = new VeggiePizza();
        System.out.println(veggiePizza.getName());

        // loose coupling
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza myPizza = pizzaFactory.getPizza(PizzaType.VEGGIE);
        System.out.println(myPizza.getName());
    }
}
