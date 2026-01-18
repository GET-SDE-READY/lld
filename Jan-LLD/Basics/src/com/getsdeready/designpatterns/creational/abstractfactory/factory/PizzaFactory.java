package com.getsdeready.designpatterns.creational.abstractfactory.factory;

import com.getsdeready.design.creational.abstractfactory.pizza.Pizza;
import com.getsdeready.design.creational.abstractfactory.pizza.PizzaType;

public interface PizzaFactory {

    Pizza getPizza(PizzaType type);
}
