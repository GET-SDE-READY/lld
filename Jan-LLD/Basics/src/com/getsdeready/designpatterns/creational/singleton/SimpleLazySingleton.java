package com.getsdeready.designpatterns.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SimpleLazySingleton implements Serializable {

    private static SimpleLazySingleton INSTANCE;

    private SimpleLazySingleton() {
        // Avoid singleton break patterns using Reflections
        if (INSTANCE != null) {
            throw new RuntimeException();
        }
    }

    // initialised on first call
    public static SimpleLazySingleton getInstance() {
        // Lazy initialisation
        if (INSTANCE == null) {
            INSTANCE = new SimpleLazySingleton();
        }
        return INSTANCE;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}
