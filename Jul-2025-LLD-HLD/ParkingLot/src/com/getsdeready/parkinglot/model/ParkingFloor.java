package com.getsdeready.parkinglot.model;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingFloor {
    private int floorId;

    // collection of parking spots by parking type
    private ConcurrentHashMap<ParkingType, List<ParkingSpot>> occupiedSpots;
    private ConcurrentHashMap<ParkingType, List<ParkingSpot>> vacantSpots;

    public ParkingFloor() {
        this.occupiedSpots = new ConcurrentHashMap<>();
        this.vacantSpots = new ConcurrentHashMap<>();

        for (ParkingType parkingType : ParkingType.values()) {
            this.occupiedSpots.put(parkingType, new ArrayList<>());
            this.vacantSpots.put(parkingType, new ArrayList<>());
        }
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        List<ParkingSpot> parkingSpots = this.vacantSpots
                .get(parkingSpot.getParkingType());

        if (Objects.isNull(parkingSpots)) {
            parkingSpots = new ArrayList<>();
        }
        parkingSpots.add(parkingSpot);

        this.vacantSpots
                .put(parkingSpot.getParkingType(), parkingSpots);
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public Map<ParkingType, List<ParkingSpot>> getOccupiedSpots() {
        return occupiedSpots;
    }

    public void setOccupiedSpots(ConcurrentHashMap<ParkingType, List<ParkingSpot>> occupiedSpots) {
        this.occupiedSpots = occupiedSpots;
    }

    public Map<ParkingType, List<ParkingSpot>> getVacantSpots() {
        return vacantSpots;
    }

    public void setVacantSpots(ConcurrentHashMap<ParkingType, List<ParkingSpot>> vacantSpots) {
        this.vacantSpots = vacantSpots;
    }
}
