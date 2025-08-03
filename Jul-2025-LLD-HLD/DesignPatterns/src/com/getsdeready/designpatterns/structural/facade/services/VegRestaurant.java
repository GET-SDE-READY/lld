package com.getsdeready.designpatterns.structural.facade.services;

public class VegRestaurant implements Hotel {

    @Override
    public String getMenu() {
        return "Serving Veg Menus";
    }
}
