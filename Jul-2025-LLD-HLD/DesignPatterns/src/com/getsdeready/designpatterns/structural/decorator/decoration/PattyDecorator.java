package com.getsdeready.designpatterns.structural.decorator.decoration;

import com.getsdeready.designpatterns.structural.decorator.Burger;

public class PattyDecorator extends BurgerDecorator {

    public PattyDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return "Extra Patty " + this.burger.getDescription();
    }

    @Override
    public Double getCost() {
        return 5.0 + this.burger.getCost();
    }
}


//python
