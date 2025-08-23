package com.getsdeready.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard implements Subject {

    private final List<Observer> observers;

    public Scoreboard() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(BowlingEvent bowlingEvent) {
        System.out.println("Publishing message to observers");
        for (Observer o : observers) {
            o.update(bowlingEvent);
        }
    }

    public void display() {
        for (Observer o : observers) {
            o.display();
        }
    }
}
