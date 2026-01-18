package com.getsdeready.designpatterns.structural.decorator.decoration;

import com.getsdeready.designpatterns.structural.decorator.Burger;

public class KetchupDecorator extends BurgerDecorator {

    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return "Extra Ketchup " + this.burger.getDescription();
    }

    @Override
    public Double getCost() {
        return 1.0 + this.burger.getCost();
    }
}
