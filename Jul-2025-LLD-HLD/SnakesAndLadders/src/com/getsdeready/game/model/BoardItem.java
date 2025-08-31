package com.getsdeready.game.model;

public abstract class BoardItem {
    protected String type;
    protected int start;
    protected int end;

    public BoardItem(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
