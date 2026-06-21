package com.getsdeready.lld.basics.designpatterns.creational.singleton;

public class MySingleton {

    private static volatile MySingleton INSTANCE = null;

    private MySingleton() {}

    public static MySingleton getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    Thread.sleep(1000);
                    INSTANCE = new MySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public synchronized static MySingleton getInstanceSynchronized() throws InterruptedException {
        if (INSTANCE == null) {
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
