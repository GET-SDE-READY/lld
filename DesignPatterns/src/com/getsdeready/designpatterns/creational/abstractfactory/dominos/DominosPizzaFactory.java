package com.getsdeready.designpatterns.creational.abstractfactory.dominos;


import com.getsdeready.designpatterns.creational.abstractfactory.IPizza;
import com.getsdeready.designpatterns.creational.abstractfactory.IPizzaFactory;
import com.getsdeready.designpatterns.creational.abstractfactory.PizzaType;

public class DominosPizzaFactory implements IPizzaFactory {

    // preferred
    public IPizza getPizza(PizzaType type) {
        return switch (type) {
            case VEG -> new VeggieParadisePizza();
            case MARGERITA -> new Margerita();
            default -> throw new RuntimeException("Pizza Type not supported");
        };
    }
}
