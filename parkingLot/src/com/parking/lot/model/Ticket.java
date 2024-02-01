package com.parking.lot.model;

import java.time.LocalDateTime;

public class Ticket {
    private Vehicle vehicle;
    private ParkingSpace spot;
    private LocalDateTime inTime;
    private String id;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpace getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpace spot) {
        this.spot = spot;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
