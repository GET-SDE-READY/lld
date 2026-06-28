package com.getsdeready.lld.basics.designpatterns.structural.decorator;

import com.getsdeready.lld.basics.designpatterns.structural.decorator.decoration.CheeseBurstDecorator;
import com.getsdeready.lld.basics.designpatterns.structural.decorator.decoration.StuffedCrust;
import com.getsdeready.lld.basics.designpatterns.structural.decorator.violation.CheeseBurstPlainPizza;
import com.getsdeready.lld.basics.designpatterns.structural.decorator.violation.Pizza;

public class Driver {

    public static void main(String[] args) {

        //Without Decorator
        Pizza p = new Pizza();
        Pizza cheeseBurstPlainPizza = new CheeseBurstPlainPizza();


        // With Decorator
        IPizza pizza = new PlainPizza();
        IPizza pizzaDecoration = new CheeseBurstDecorator(pizza);
        IPizza stuffedCrustPizza = new StuffedCrust(pizzaDecoration);

        System.out.println(stuffedCrustPizza.getName());
        System.out.println(stuffedCrustPizza.getCost());
    }
}
