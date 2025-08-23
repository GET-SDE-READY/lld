package com.getsdeready.designpatterns.behavioral.observer;

import java.util.concurrent.atomic.AtomicInteger;

public class OverObserver implements Observer {

    // state of the class
    private final AtomicInteger bowls;

    public OverObserver() {
        this.bowls = new AtomicInteger();
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        if (bowlingEvent.isValidBowl())
            this.bowls.getAndIncrement();
    }

    @Override
    public void display() {
        System.out.println("Current Over is: " + (this.bowls.get()/6) + "." + (this.bowls.get()%6));
    }
}
