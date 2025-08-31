package com.getsdeready.game.model;

import java.util.Objects;

public class Cell {
    private int position;
    private BoardItem boardItem;

    public Cell(int position, BoardItem boardItem) {
        this.boardItem = boardItem;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public BoardItem getBoardItem() {
        return boardItem;
    }

    public void setBoardItem(BoardItem boardItem) {
        this.boardItem = boardItem;
    }

    public int getFinalPosition() {
        if (Objects.nonNull(boardItem)) {
            System.out.println("Player encountered a " + boardItem.getType());
            return boardItem.getEnd();
        }

        return position;
    }
}
