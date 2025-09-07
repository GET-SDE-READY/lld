package com.getsdeready.parkinglot.model;

public class Vehicle {
    private String regNumber;
    private ParkingType vehicleType;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public ParkingType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(ParkingType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
