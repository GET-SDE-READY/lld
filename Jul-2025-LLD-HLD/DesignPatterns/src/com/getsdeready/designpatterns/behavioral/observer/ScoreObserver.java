package com.getsdeready.designpatterns.behavioral.observer;

import java.util.concurrent.atomic.AtomicInteger;

public class ScoreObserver implements Observer {

    // state of the class
    private final AtomicInteger scores;

    public ScoreObserver() {
        this.scores = new AtomicInteger();
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        synchronized (this.scores) {
            this.scores.getAndAdd(bowlingEvent.getScores());
        }
    }

    @Override
    public void display() {
        System.out.println("Current Score is: " + this.scores);
    }
}
