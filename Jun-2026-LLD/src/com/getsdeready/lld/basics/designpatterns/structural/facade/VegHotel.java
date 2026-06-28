package com.getsdeready.lld.basics.designpatterns.structural.facade;

public class VegHotel implements Hotel {
    @Override
    public String getMenu() {
        return "Veg Menu Items";
    }
}
