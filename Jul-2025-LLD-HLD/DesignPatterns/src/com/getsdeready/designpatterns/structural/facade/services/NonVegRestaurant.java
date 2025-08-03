package com.getsdeready.designpatterns.structural.facade.services;

public class NonVegRestaurant implements Hotel {

    @Override
    public String getMenu() {
        return "Serving Non-Veg Menu";
    }
}
