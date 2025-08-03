package com.getsdeready.designpatterns.structural.facade;

import com.getsdeready.designpatterns.structural.facade.keeper.MenuManager;
import com.getsdeready.designpatterns.structural.facade.services.NonVegRestaurant;
import com.getsdeready.designpatterns.structural.facade.services.VegRestaurant;

public class Driver {

    public static void main(String[] args) {

        // DI container framework
        // Spring/Guice/Dagger/Django
        MenuManager menuManager = new MenuManager(
                new VegRestaurant(), new NonVegRestaurant()
        );

        System.out.println(menuManager.getVegMenu());
        System.out.println(menuManager.getNonVegMenu());
        System.out.println(menuManager.getBothMenu());
    }
}
