package com.getsdeready.parkinglot.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Dashboard {
    private ConcurrentHashMap<ParkingType, Integer> occupiedSlots;
    private ConcurrentHashMap<ParkingType, Integer> vacantSpots;

    // if we want to have floor to parking type to parking space count
    // we can alter the map as follows:
    // private Map<Integer, Map<ParkingType, Integer>> occupiedSlots;
    // private Map<Integer, Map<ParkingType, Integer>> vacantSpots;

    public Dashboard() {
        this.occupiedSlots = new ConcurrentHashMap<>();
        this.vacantSpots = new ConcurrentHashMap<>();
    }

    public Map<ParkingType, Integer> getOccupiedSlots() {
        return occupiedSlots;
    }

    public void setOccupiedSlots(ConcurrentHashMap<ParkingType, Integer> occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }

    public Map<ParkingType, Integer> getVacantSpots() {
        return vacantSpots;
    }

    public void setVacantSpots(ConcurrentHashMap<ParkingType, Integer> vacantSpots) {
        this.vacantSpots = vacantSpots;
    }

    public void notify(Ticket ticket, ParkingEventType type) {
        ParkingType parkingType = ticket.getParkingSpot().getParkingType();
        if (type == ParkingEventType.PARK) {
            vacantSpots.put(parkingType, vacantSpots.get(parkingType) - 1);
            occupiedSlots.put(parkingType, occupiedSlots.get(parkingType) + 1);
        } else {
            vacantSpots.put(parkingType, vacantSpots.get(parkingType) + 1);
            occupiedSlots.put(parkingType, occupiedSlots.get(parkingType) - 1);
        }
    }

    public void display() {
        for (Map.Entry<ParkingType, Integer> parkingType : occupiedSlots.entrySet()) {
            if (parkingType != null && parkingType.getKey() != null && parkingType.getValue() != null)
                System.out.println("Occupied slots for : " + parkingType.getKey() + " are : " + parkingType.getValue());
        }

        for (Map.Entry<ParkingType, Integer> parkingType : vacantSpots.entrySet()) {
            if (parkingType != null && parkingType.getKey() != null && parkingType.getValue() != null)
                System.out.println("Vacant slots for : " + parkingType.getKey() + " are : " + parkingType.getValue());
        }
    }
}
