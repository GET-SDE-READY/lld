package com.getsdeready.lld.basics.designpatterns.creational.singleton;

public enum MySingletonEnum {

    INSTANCE;

    public void doSomething() {
        System.out.println("Doing Something");
    }
}
