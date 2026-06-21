package com.getsdeready.lld.basics.designpatterns.creational.singleton;

public class Driver {

    public static void main(String[] args) {
//        MySingleton object = MySingleton.getInstance();
//        MySingleton object1 = MySingleton.getInstance();
//        System.out.println(object);
//        System.out.println(object1);
//        object.doSomething();

        Runnable t1 = () -> {
            MySingleton s = null;
            try {
                s = MySingleton.getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(s);
        };

        new Thread(t1).start();

        MySingletonEnum.INSTANCE.doSomething();
    }
}
