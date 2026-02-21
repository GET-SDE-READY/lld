package com.getsdeready.snakes.model;

public abstract class BoardItem {

    protected final Integer start;
    protected final Integer end;
    protected BoardItemType type;

    public BoardItem(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStartingPosition() {
        return this.start;
    }

    public Integer getFinalPosition() {
        return this.end;
    }

    public BoardItemType getType() {
        return this.type;
    }
}
