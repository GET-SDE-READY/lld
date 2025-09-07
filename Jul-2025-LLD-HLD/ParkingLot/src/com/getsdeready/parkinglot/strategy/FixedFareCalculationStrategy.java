package com.getsdeready.parkinglot.strategy;

import com.getsdeready.parkinglot.model.ParkingType;
import com.getsdeready.parkinglot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class FixedFareCalculationStrategy implements IFareCalculationStrategy {

    private Map<ParkingType, Double> fixedFareMap = new HashMap<>();

    public FixedFareCalculationStrategy() {
        fixedFareMap.put(ParkingType.TWO_WHEELER, 50.0);
        fixedFareMap.put(ParkingType.LMV, 80.0);
        fixedFareMap.put(ParkingType.HMV, 100.0);
        fixedFareMap.put(ParkingType.ELECTRIC, 80.0);
    }

    @Override
    public Double calculateFare(Ticket ticket) {
        if (fixedFareMap.containsKey(ticket.getVehicle().getVehicleType()))
            return fixedFareMap.get(ticket.getVehicle().getVehicleType());

        throw new RuntimeException("Vehicle type not supported by fare calculation");
    }
}
