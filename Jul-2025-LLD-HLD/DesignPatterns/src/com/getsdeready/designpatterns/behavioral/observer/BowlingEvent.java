package com.getsdeready.designpatterns.behavioral.observer;

public class BowlingEvent {
    private int scores;
    private int wickets;
    private boolean isValidBowl;

    public BowlingEvent(int scores, int wickets, boolean isValidBowl) {
        this.scores = scores;
        this.wickets = wickets;
        this.isValidBowl = isValidBowl;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public boolean isValidBowl() {
        return isValidBowl;
    }

    public void setValidBowl(boolean validBowl) {
        isValidBowl = validBowl;
    }
}
