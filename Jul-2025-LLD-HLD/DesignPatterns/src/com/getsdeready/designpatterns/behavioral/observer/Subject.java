package com.getsdeready.designpatterns.behavioral.observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(BowlingEvent bowlingEvent);
}
