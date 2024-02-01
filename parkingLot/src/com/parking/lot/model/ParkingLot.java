package com.parking.lot.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private Map<Integer, ParkingFloor> parkingFloors = new HashMap<>();

    public Map<Integer, ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(Map<Integer, ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
