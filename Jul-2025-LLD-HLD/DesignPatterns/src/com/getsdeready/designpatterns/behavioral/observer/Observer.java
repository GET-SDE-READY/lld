package com.getsdeready.designpatterns.behavioral.observer;

public interface Observer {

    void update(BowlingEvent bowlingEvent);
    void display();
}
