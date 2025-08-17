package com.getsdeready.designpatterns.structural.bridge;

// refined abstraction
public class ManufactureCarWorkshop implements Workshop {
    @Override
    public void work() {
        System.out.println("Manufacture a Car");
    }
}
