package com.getsdeready.designpatterns.behavioral.observer;

public class WicketObserver implements Observer {

    private Integer wickets;

    public WicketObserver() {
        this.wickets = 0;
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        wickets += bowlingEvent.getWickets();
    }

    @Override
    public void display() {
        System.out.println("Current Wicket count is: " + this.wickets);
    }
}
