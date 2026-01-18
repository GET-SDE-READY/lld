package com.getsdeready.designpatterns.structural.decorator;

public class Client {

    public Burger create() {
        return new PlainBurger();
    }

    public Burger addDecoration(final Burger burger,
                                String decorationType) {
        // get a decorator object using factory
        // add burger to it
        // return
        return null;
    }
}
