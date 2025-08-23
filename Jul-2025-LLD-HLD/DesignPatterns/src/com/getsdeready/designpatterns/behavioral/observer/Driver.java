package com.getsdeready.designpatterns.behavioral.observer;

public class Driver {

    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();

        Observer scoreObserver = new ScoreObserver();
        Observer wicketObserver = new WicketObserver();
        Observer overObserver = new OverObserver();

        scoreboard.addObserver(scoreObserver);
        scoreboard.addObserver(wicketObserver);
        scoreboard.addObserver(overObserver);

        // started notifying
        scoreboard.notifyObservers(new BowlingEvent(1, 0, true));
        scoreboard.display();

        scoreboard.notifyObservers(new BowlingEvent(6, 0, true));
        scoreboard.display();

        scoreboard.notifyObservers(new BowlingEvent(0, 1, true));
        scoreboard.display();

        scoreboard.notifyObservers(new BowlingEvent(1, 0, false));
        scoreboard.display();
    }
}
