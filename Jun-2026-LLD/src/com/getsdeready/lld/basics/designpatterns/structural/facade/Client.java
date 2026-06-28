package com.getsdeready.lld.basics.designpatterns.structural.facade;

public class Client {

//    private VegHotel vegHotel;
//    private NonVegHotel nonVegHotel;
    private final MenuKeeper menuKeeper;

    public Client(MenuKeeper menuKeeper) {
        this.menuKeeper = menuKeeper;
    }

    public void getMenus() {
        System.out.println(menuKeeper.getVegMenu());
        System.out.println(menuKeeper.getNonVegMenu());
    }
}
