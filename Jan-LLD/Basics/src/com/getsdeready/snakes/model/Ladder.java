package com.getsdeready.snakes.model;

public class Ladder extends BoardItem {

    public Ladder(Integer start, Integer end) {
        super(start, end);
        this.type = BoardItemType.LADDER;

        if (start > end) {
            throw new IllegalArgumentException("Ladder start cannot be greater than end");
        }
    }
}
