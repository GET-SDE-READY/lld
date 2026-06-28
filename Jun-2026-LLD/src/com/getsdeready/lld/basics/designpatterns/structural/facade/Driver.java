package com.getsdeready.lld.basics.designpatterns.structural.facade;

public class Driver {

    public static void main(String[] args) {
        MenuKeeper menuKeeper = new MenuKeeper(new VegHotel(), new NonVegHotel());
        Client client = new Client(menuKeeper);

        client.getMenus();
    }
}
