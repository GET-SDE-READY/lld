package com.parking.lot.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {

    private String buildingId;
    private int floorId;
    private Map<ParkingType, ParkingSpacePOJO> parkingSpaceMap = new HashMap<>();

    public ParkingFloor() {
        this.parkingSpaceMap = new HashMap<>();
    }

    public Map<ParkingType, ParkingSpacePOJO> getParkingSpaceMap() {
        return parkingSpaceMap;
    }

    public void setParkingSpaceMap(Map<ParkingType, ParkingSpacePOJO> parkingSpaceMap) {
        this.parkingSpaceMap = parkingSpaceMap;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }
}
