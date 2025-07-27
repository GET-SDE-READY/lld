package com.getsdeready.designpatterns.creational.factory;

public class DriverClass {

    public static void main(String[] args) {

        // Tightly coupled
        // Pizza veggiePizza = new VeggiePizza();
        // Pizza margeritaPizza = new Margerita();

        Pizza veggiePizza = PizzaFactory
                .getPizza(PizzaType.VEG);
        Pizza margeritaPizza = PizzaFactory
                .getPizza(PizzaType.MARGERITA);

        // singleton
        PizzaFactory pizzaFactory = new PizzaFactory();
        pizzaFactory.getPizzaNonStatic(PizzaType.VEG);

        IPizza veggieIPizza = PizzaFactory
                .getIPizza(PizzaType.VEG);
    }
}
