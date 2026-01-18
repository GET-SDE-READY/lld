package com.getsdeready.designpatterns.creational.singleton;

public class StaticSingleton {

    // EAGER initialisation
    private static final StaticSingleton INSTANCE;

    // static initialiser block
    static {
        INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return INSTANCE;
    }
}
