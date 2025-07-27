package com.getsdeready.designpatterns.creational.factory;

public class PizzaFactory {

    // preferred
    public static Pizza getPizza(PizzaType type) {
        return switch (type) {
            case VEG -> new VeggiePizza();
            case MARGERITA -> new Margerita();
            default -> throw new RuntimeException("Pizza Type not supported");
        };
    }

    // preferred
    public static IPizza getIPizza(PizzaType type) {
        return switch (type) {
            case VEG -> new VeggieParadisePizza();
            default -> throw new RuntimeException("Pizza Type not supported");
        };
    }

    // make class singleton
    public Pizza getPizzaNonStatic(PizzaType type) {
        return switch (type) {
            case VEG -> new VeggiePizza();
            case MARGERITA -> new Margerita();
            default -> throw new RuntimeException("Pizza Type not supported");
        };
    }
}
