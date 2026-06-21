package com.getsdeready.lld.basics.designpatterns.creational.singleton;

public class MySingletonBillPugh {

    // pros: no complex double locking logic to be writted
    // takes advantage of the way classes are loaded
    // inner classes are loaded when called for the first time
    // so, no delay in startup time
    private MySingletonBillPugh() {}

    private static class SingletonHolder {
        private static final MySingletonBillPugh INSTANCE =
                new MySingletonBillPugh();
    }

    public static MySingletonBillPugh getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
