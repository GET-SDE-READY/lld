package com.getsdeready.lld.elevator.model;

public class ExternalRequest {
    private int sourceFloor;
    private Direction directionToGo;

    public ExternalRequest(int sourceFloor, Direction directionToGo) {
        this.sourceFloor = sourceFloor;
        this.directionToGo = directionToGo;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }

    public Direction getDirectionToGo() {
        return directionToGo;
    }

    public void setDirectionToGo(Direction directionToGo) {
        this.directionToGo = directionToGo;
    }
}
