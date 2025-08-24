package com.getsdeready.designpatterns.behavioral.command;

// RECEIVER
public class Light {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }

    public void flicker() {
        System.out.println("Light is FLICKERING");
    }
}
