package com.getsdeready.game.model;

public class Snake extends BoardItem {

    public Snake(int start, int end) {
        super(start, end);

        this.type = "SNAKE";

        if (start <= end) {
            throw new RuntimeException("Invalid Snake positions");
        }
    }
}
