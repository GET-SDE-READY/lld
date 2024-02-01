package com.parking.lot.model;

import java.util.HashMap;
import java.util.Map;

public class Dashboard {

    private Map<ParkingType, Integer> emptySlots;
    private Map<ParkingType, Integer> occupiedSlots;

    public Dashboard() {
        this.emptySlots = new HashMap<>();
        this.occupiedSlots = new HashMap<>();
    }

    public void update(ParkingType type, boolean occupied) {
        if (occupied) {
            occupiedSlots.put(type, occupiedSlots.getOrDefault(type, 0) + 1);
            emptySlots.put(type, emptySlots.getOrDefault(type, 1) - 1);
        } else {
            emptySlots.put(type, emptySlots.getOrDefault(type, 0) + 1);
            occupiedSlots.put(type, occupiedSlots.getOrDefault(type, 1) - 1);
        }
    }

    public void display() {
        System.out.println("Empty Slots: " + emptySlots);
        System.out.println("Occupied Slots: " + occupiedSlots);
    }

    public Map<ParkingType, Integer> getEmptySlots() {
        return emptySlots;
    }

    public void setEmptySlots(Map<ParkingType, Integer> emptySlots) {
        this.emptySlots = emptySlots;
    }

    public Map<ParkingType, Integer> getOccupiedSlots() {
        return occupiedSlots;
    }

    public void setOccupiedSlots(Map<ParkingType, Integer> occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }
}
