package com.getsdeready.designpatterns.structural.facade.keeper;

import com.getsdeready.designpatterns.structural.facade.services.Hotel;
import com.getsdeready.designpatterns.structural.facade.services.VegRestaurant;

public class MenuManager {

    private final Hotel vegRestaurant;
    private final Hotel nonVegRestaurant;

    public MenuManager(final Hotel vegRestaurant,
                       final Hotel nonVegRestaurant) {
        this.nonVegRestaurant = nonVegRestaurant;
        this.vegRestaurant = vegRestaurant;
    }

    public String getVegMenu() {
        return this.vegRestaurant.getMenu();
    }

    public String getNonVegMenu() {
        return this.nonVegRestaurant.getMenu();
    }

    public String getBothMenu() {
        return this.getVegMenu() + " " + this.getNonVegMenu();
    }
}
