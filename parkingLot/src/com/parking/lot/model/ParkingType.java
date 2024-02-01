package com.parking.lot.model;

public enum ParkingType {
    CAR(20, 10),
    BIKE(10, 5),
    TRUCK(30, 10);

    private int baseCharge;
    private int perHourCharge;

    ParkingType(int baseCharge, int perHourCharge) {
        this.baseCharge = baseCharge;
        this.perHourCharge = perHourCharge;
    }

    public int getBaseCharge() {
        return baseCharge;
    }

    public int getPerHourCharge() {
        return perHourCharge;
    }
}
