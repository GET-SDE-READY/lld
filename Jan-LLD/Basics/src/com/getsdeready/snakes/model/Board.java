package com.getsdeready.snakes.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Cell> cells;

    public Board(int size) {
        this.cells = new ArrayList<>(size);

        for (int i = 0; i < size; ++i) {
            this.cells.add(new Cell(i, null));
        }
    }

    public List<Cell> getCells() {
        return this.cells;
    }

    public void move(Player player, Dice dice) {
        int roll = player.roll(dice);
        int currentPosition = player.getCurrentPosition();

        if (isValidMove(currentPosition, roll)) {
            int finalPosition = currentPosition + roll;

            if (finalPosition < this.cells.size()) {
                Cell cell = this.cells.get(finalPosition);
                finalPosition = cell.getFinalPosition();
            }

            System.out.println("Player " + player.getId() + " moving from " + currentPosition + " to " + finalPosition);
            player.setCurrentPosition(finalPosition);
        } else {
            System.out.println("Player " + player.getId() + " cannot move");
        }
        player.setTurns(player.getTurns() + 1);
        player.setLastDiceRoll(roll);
    }

    public boolean isValidMove(int currentPosition, int roll) {
        return currentPosition + roll <= this.cells.size();
    }
}
