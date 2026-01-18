package com.getsdeready.designpatterns.structural.decorator.decoration;

import com.getsdeready.designpatterns.structural.decorator.Burger;

public abstract class BurgerDecorator implements Burger {

    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
}
