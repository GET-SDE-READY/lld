package com.getsdeready.designpatterns.creational.singleton;

import java.lang.reflect.InvocationTargetException;

public class Driver {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
//        SimpleSingleton s = new SimpleSingleton();
//        SimpleSingleton s1 = new SimpleSingleton();
//        SimpleSingleton s2 = new SimpleSingleton();
//        SimpleSingleton s3 = new SimpleSingleton();

        EagerSingleton s = EagerSingleton.getInstance();
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        EagerSingleton s3 = EagerSingleton.getInstance();

//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);


        EnumSingleton obj = EnumSingleton.INSTANCE;
        obj.doSomething();

//        SimpleLazySingleton singleton = SimpleLazySingleton.getInstance();
//        System.out.println(singleton);
//
//        Constructor[] constructors = SimpleLazySingleton.class.getDeclaredConstructors();
//        for (Constructor con : constructors) {
//            con.setAccessible(true);
//            SimpleLazySingleton simpleLazySingleton = (SimpleLazySingleton) con.newInstance();
//            System.out.println(simpleLazySingleton);
//        }
    }
}
