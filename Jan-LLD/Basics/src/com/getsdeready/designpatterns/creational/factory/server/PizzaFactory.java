package com.getsdeready.designpatterns.creational.factory.server;

public class PizzaFactory {

    public Pizza getPizza(PizzaType type) {
        return switch (type) {
            case VEGGIE -> new VeggiePizza();
            case MARGERITA -> new MargeritaPizza();
        };

    }
}
