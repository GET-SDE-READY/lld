package com.parking.lot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpacePOJO {

    private List<ParkingSpace> emptySpaces = new ArrayList<>();
    private List<ParkingSpace> occupiedSpaces = new ArrayList<>();

    public ParkingSpacePOJO() {
        this.emptySpaces = new ArrayList<>();
        this.occupiedSpaces = new ArrayList<>();
    }

    public List<ParkingSpace> getEmptySpaces() {
        return emptySpaces;
    }

    public void setEmptySpaces(List<ParkingSpace> emptySpaces) {
        this.emptySpaces = emptySpaces;
    }

    public List<ParkingSpace> getOccupiedSpaces() {
        return occupiedSpaces;
    }

    public void setOccupiedSpaces(List<ParkingSpace> occupiedSpaces) {
        this.occupiedSpaces = occupiedSpaces;
    }
}
