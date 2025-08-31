package com.getsdeready.game.model;

public class Player {
    private int id;
    private int currentPosition;
    private boolean isActive;
    private int lastDiceRoll;
    private int turns;


    public Player(int id) {
        this.id = id;
        this.currentPosition = 0;
        this.isActive = false;
        this.lastDiceRoll = 0;
        this.turns = 0;
    }

    public int getLastDiceRoll() {
        return lastDiceRoll;
    }

    public void setLastDiceRoll(int lastDiceRoll) {
        this.lastDiceRoll = lastDiceRoll;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getId() {
        return id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void assignToGame() {
        this.isActive = true;
    }

    public int roll(Dice dice) {
        return dice.getDiceRoll();
    }


}
