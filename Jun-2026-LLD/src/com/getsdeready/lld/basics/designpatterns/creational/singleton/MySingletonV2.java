package com.getsdeready.lld.basics.designpatterns.creational.singleton;

public class MySingletonV2 {
    // hot start
    // pros: easy to implement, no performance impact at runtime
    // cons: if the class is heavy, it can increase start up time
    private final static MySingletonV2 INSTANCE = new MySingletonV2();

    private MySingletonV2() {}

    public static MySingletonV2 getInstance() throws InterruptedException {
        return INSTANCE;
    }
}
