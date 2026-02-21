package com.getsdeready.snakes.model;

public class Player {

    private int id;
    private int currentPosition;
    private int turns;
    private int lastDiceRoll;
    private boolean isActive;


    public Player(int id) {
        this.id = id;
        this.currentPosition = 0;
        this.turns = 0;
        this.isActive = true;
        this.lastDiceRoll = 0;
    }

    // Give the player a dice to throw
    public int roll(Dice dice) {
        return dice.getDiceThrow();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setLastDiceRoll(int lastDiceRoll) {
        this.lastDiceRoll = lastDiceRoll;
    }

    public int getLastDiceRoll() {
        return this.lastDiceRoll;
    }
}
