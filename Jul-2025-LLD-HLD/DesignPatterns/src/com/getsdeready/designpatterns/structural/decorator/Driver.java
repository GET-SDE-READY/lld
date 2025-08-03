package com.getsdeready.designpatterns.structural.decorator;

import com.getsdeready.designpatterns.structural.decorator.decoration.KetchupDecorator;
import com.getsdeready.designpatterns.structural.decorator.decoration.PattyDecorator;

public class Driver {

    public static void main(String[] args) {

        Burger alooTikkiBurger = new AlooTikkiBurger();
        Burger veggieBurger = new VeggieBurger();

        Burger extraPattyAlooTikkiBurger = new PattyDecorator(alooTikkiBurger);
        Burger extraPattyVeggieBurger = new PattyDecorator(veggieBurger);


        // button for extra Ketchup pressed
        Burger extraKetchupExtraPattyVeggieBurger =
                new KetchupDecorator(extraPattyVeggieBurger);

        System.out.println("Aloo Tikki Burger");
        System.out.println(extraPattyAlooTikkiBurger.getDescription());
        System.out.println(extraPattyAlooTikkiBurger.getCost());

        System.out.println("Veggie Burger");
        System.out.println(extraPattyVeggieBurger.getDescription());
        System.out.println(extraPattyVeggieBurger.getCost());

        System.out.println(extraKetchupExtraPattyVeggieBurger.getDescription());
        System.out.println(extraKetchupExtraPattyVeggieBurger.getCost());

        // getDescription
        // Ketchup Decorator -> Patty Decorator -> Veggie Burger
        // Extra Ketchup     -> Extra Patty     -> Veggie Burger
    }
}
