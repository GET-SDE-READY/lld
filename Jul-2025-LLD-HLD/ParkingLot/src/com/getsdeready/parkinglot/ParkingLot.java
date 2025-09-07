package com.getsdeready.parkinglot;

import com.getsdeready.parkinglot.model.*;
import com.getsdeready.parkinglot.strategy.IFareCalculationStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {

    private final ConcurrentHashMap<Integer, ParkingFloor> parkingFloors;
    private final IFareCalculationStrategy fareCalculationStrategy;
    private final Dashboard dashboard;

    public ParkingLot(IFareCalculationStrategy fareCalculationStrategy,
                      Dashboard dashboard) {
        this.parkingFloors = new ConcurrentHashMap<>();
        this.fareCalculationStrategy = fareCalculationStrategy;
        this.dashboard = dashboard;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloors.put(parkingFloor.getFloorId(), parkingFloor);
    }

    public Ticket park(Vehicle vehicle) {
        for (Map.Entry<Integer, ParkingFloor> parkingFloor : this.parkingFloors.entrySet()) {
            if (!parkingFloor.getValue().getVacantSpots().get(vehicle.getVehicleType()).isEmpty()) {
                ParkingSpot parkingSpot = parkingFloor.getValue().getVacantSpots().get(vehicle.getVehicleType()).get(0);

                // mark it as occupied
                parkingSpot.setAvailable(false);

                // move it to occupied spots
                parkingFloor.getValue().getVacantSpots().get(vehicle.getVehicleType()).remove(parkingSpot);
                parkingFloor.getValue().getOccupiedSpots().get(vehicle.getVehicleType()).add(parkingSpot);

                // issue a ticket
                Ticket ticket = new Ticket();
                ticket.setParkingSpot(parkingSpot);
                ticket.setVehicle(vehicle);

                dashboard.notify(ticket, ParkingEventType.PARK);
                return ticket;
            }
        }

        throw new RuntimeException("Parking Lot is full");
    }


    public Double unpark(Ticket ticket) {
        // calculate fare
        Double parkingCharges = fareCalculationStrategy.calculateFare(ticket);

        // mark spot as vacant
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.setAvailable(true);

        // move the spot to vacant list
        this.parkingFloors.get(parkingSpot.getFloor()).getOccupiedSpots()
                .get(parkingSpot.getParkingType())
                .remove(parkingSpot);

        this.parkingFloors.get(parkingSpot.getFloor()).getVacantSpots()
                .get(parkingSpot.getParkingType())
                .add(parkingSpot);

        dashboard.notify(ticket, ParkingEventType.UNPARK);
        return parkingCharges;
    }
}
