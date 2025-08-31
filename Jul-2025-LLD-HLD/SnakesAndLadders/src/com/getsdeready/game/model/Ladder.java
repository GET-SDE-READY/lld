package com.getsdeready.game.model;

public class Ladder extends BoardItem {

    public Ladder(int start, int end) {
        super(start, end);
        this.type = "LADDER";

        if (start >= end) {
            throw new RuntimeException("Invalid Ladder positions");
        }
    }
}
