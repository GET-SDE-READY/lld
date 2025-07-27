package com.getsdeready.designpatterns.creational;

// loaded first at time of execution
public class MySingleton {

    // constructor
    private MySingleton() {}

    // BillPugh method
    // loaded when first reference is done
    private static final class InstanceHolder {
        // cold start
        private static final MySingleton INSTANCE = new MySingleton();
    }

    // 3 threads
    public static MySingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
