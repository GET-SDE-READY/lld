package com.getsdeready.lld.basics.designpatterns.structural.facade;

public class MenuKeeper {

    private VegHotel vegHotel;
    private NonVegHotel nonVegHotel;

    public MenuKeeper(VegHotel vegHotel, NonVegHotel nonVegHotel) {
        this.vegHotel = vegHotel;
        this.nonVegHotel = nonVegHotel;
    }

    public String getVegMenu() {
        return vegHotel.getMenu();
    }

    public String getNonVegMenu() {
        return nonVegHotel.getMenu();
    }

    public String getAllMenu() {
        return vegHotel.getMenu() + " " + nonVegHotel.getMenu();
    }
}
