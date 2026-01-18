package com.getsdeready.designpatterns.creational.singleton;

public class EagerSingleton {

    // EAGER initialisation
    private static final EagerSingleton INSTANCE
            = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
