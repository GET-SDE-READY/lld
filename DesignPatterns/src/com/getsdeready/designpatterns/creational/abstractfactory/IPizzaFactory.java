package com.getsdeready.designpatterns.creational.abstractfactory;

public interface IPizzaFactory {

    IPizza getPizza(PizzaType pizzaType);
}
