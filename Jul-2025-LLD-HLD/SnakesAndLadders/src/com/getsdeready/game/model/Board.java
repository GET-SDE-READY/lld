package com.getsdeready.game.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int boardId;
    private List<Cell> cells;

    public Board(int id, int size) {
        this.boardId = id;
        this.cells = new ArrayList<>(size);

        // create empty board
        for (int i = 0; i < size; ++i) {
            this.cells.add(new Cell(i, null));
        }
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    public void move(Player player, Dice dice) {
        int roll = player.roll(dice);
        int currentPosition = player.getCurrentPosition();
        if (isValidMove(currentPosition, roll)) {
            int finalPosition = currentPosition + roll;
            if (finalPosition < this.cells.size()) {
                Cell cell = this.cells.get(finalPosition - 1);
                finalPosition = cell.getFinalPosition();
            }

            System.out.println("Player " + player.getId() + " moving from " + currentPosition + " to " + (currentPosition + roll));
            player.setCurrentPosition(finalPosition);

            player.setTurns(player.getTurns() + 1);
            player.setLastDiceRoll(roll);
        }
    }

    // TODO: Add validation logic
    public boolean isValidMove(int currentPosition, int roll) {
        return true;
    }
}
