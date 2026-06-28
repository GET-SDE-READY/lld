package com.getsdeready.lld.basics.designpatterns.structural.facade;

public class NonVegHotel implements Hotel {
    @Override
    public String getMenu() {
        return "Non Veg Menu Items";
    }
}
