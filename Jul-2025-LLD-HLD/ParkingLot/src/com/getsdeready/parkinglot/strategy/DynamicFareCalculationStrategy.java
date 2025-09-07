package com.getsdeready.parkinglot.strategy;

import com.getsdeready.parkinglot.model.ParkingType;
import com.getsdeready.parkinglot.model.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class DynamicFareCalculationStrategy implements IFareCalculationStrategy {

    private final Map<ParkingType, DynamicFare> dynamicFareMap = new HashMap<>();

    public DynamicFareCalculationStrategy() {
        dynamicFareMap.put(ParkingType.TWO_WHEELER, new DynamicFare(50.0, 10.0));
        dynamicFareMap.put(ParkingType.LMV, new DynamicFare(80.0, 20.0));
        dynamicFareMap.put(ParkingType.HMV, new DynamicFare(100.0, 25.0));
        dynamicFareMap.put(ParkingType.ELECTRIC, new DynamicFare(80.0, 20.0));
    }

    @Override
    public Double calculateFare(Ticket ticket) {
        if (dynamicFareMap.containsKey(ticket.getVehicle().getVehicleType())) {
            LocalDateTime currentTime = LocalDateTime.now();
            LocalDateTime createdTime = ticket.getCreatedOn();

            Duration duration = Duration.between(createdTime, currentTime);

            long hours = duration.toHours();

            DynamicFare dynamicFare = dynamicFareMap.get(ticket.getVehicle().getVehicleType());
            return dynamicFare.getFixedCharge() + hours * dynamicFare.getVariableCharge();
        }

        throw new RuntimeException("Vehicle type not supported by fare calculation");
    }
}

class DynamicFare {
    double fixedCharge;
    double variableCharge;

    public DynamicFare(double fixedCharge, double variableCharge) {
        this.fixedCharge = fixedCharge;
        this.variableCharge = variableCharge;
    }

    public double getFixedCharge() {
        return fixedCharge;
    }

    public void setFixedCharge(double fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public double getVariableCharge() {
        return variableCharge;
    }

    public void setVariableCharge(double variableCharge) {
        this.variableCharge = variableCharge;
    }
}
