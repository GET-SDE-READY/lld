package com.getsdeready.designpatterns.creational.abstractfactory;

public class Driver {

    public static void main(String[] args) {
//        DominosPizzaFactory factory = new DominosPizzaFactory();
//        PizzaHutPizzaFactory pizzaHutPizzaFactory = new PizzaHutPizzaFactory();
//
//        System.out.println(factory.getPizza(PizzaType.VEG).getName());
//        System.out.println(pizzaHutPizzaFactory.getPizza(PizzaType.VEG).getName());

        // dominos UI
        IPizzaFactory dominosPizzaFactory = FactoryProvider
                .getPizzaFactory(PizzaFactoryType.DOMINOS);
        System.out.println(dominosPizzaFactory
                .getPizza(PizzaType.VEG).getName());

        // pizza hut UI
        IPizzaFactory pizzaHutPizzaFactory = FactoryProvider
                .getPizzaFactory(PizzaFactoryType.PIZZA_HUT);
        System.out.println(pizzaHutPizzaFactory
                .getPizza(PizzaType.VEG).getName());
    }
}
