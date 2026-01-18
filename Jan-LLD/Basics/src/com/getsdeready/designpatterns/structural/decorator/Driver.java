package com.getsdeready.designpatterns.structural.decorator;

import com.getsdeready.designpatterns.structural.decorator.decoration.KetchupDecorator;
import com.getsdeready.designpatterns.structural.decorator.decoration.PattyDecorator;

public class Driver {

    public static void main(String[] args) {
        Burger burger = new PlainBurger();

        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        Burger extraPattyBurger = new PattyDecorator(burger);
        System.out.println(extraPattyBurger.getDescription());
        System.out.println(extraPattyBurger.getCost());

        Burger extraKetchupBurger = new KetchupDecorator(extraPattyBurger);
        System.out.println(extraKetchupBurger.getDescription());
        System.out.println(extraKetchupBurger.getCost());


        Burger myBurger = new KetchupDecorator(new PattyDecorator(new PlainBurger()));
        System.out.println(myBurger.getDescription());
        System.out.println(myBurger.getCost());
    }
}
