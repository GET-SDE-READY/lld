package com.getsdeready.designpatterns.creational.singleton;

public enum EnumSingleton {

    INSTANCE(0);

    private int count;

    EnumSingleton(int count) {
        this.count = count;
    }

    public void doSomething() {
        System.out.println("Doing something");
        this.count++;
        System.out.println("Result of increment count " + count);
    }
}
