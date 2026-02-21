package com.getsdeready.snakes.model;

import java.util.Objects;

public class Cell {

    private final Integer position;

    // Snake/Ladder/null
    private BoardItem boardItem;

    public Cell(int position, BoardItem item) {
        this.position = position;
        this.boardItem = item;
    }

    public void setBoardItem(BoardItem boardItem) {
        this.boardItem = boardItem;
    }

    public int getFinalPosition() {
        if (Objects.nonNull(boardItem)) {
            System.out.println("Player encountered a " + boardItem.getType() + " at " + boardItem.getStartingPosition());
            return boardItem.getFinalPosition();
        }

        return position;
    }
}
