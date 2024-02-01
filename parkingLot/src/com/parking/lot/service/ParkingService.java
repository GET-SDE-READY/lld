package com.parking.lot.service;

import com.parking.lot.model.Dashboard;
import com.parking.lot.model.ParkingFloor;
import com.parking.lot.model.ParkingLot;
import com.parking.lot.model.ParkingSpace;
import com.parking.lot.model.ParkingSpacePOJO;
import com.parking.lot.model.ParkingType;
import com.parking.lot.model.Ticket;
import com.parking.lot.model.Vehicle;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.Optional;

public class ParkingService {

    private ParkingLot parkingLot;
    private Dashboard dashboard;

    public ParkingService(ParkingLot parkingLot, Dashboard dashboard) {
        this.parkingLot = parkingLot;
        this.dashboard  = dashboard;
    }

    public void addParkingFloor(String buildingId, Map<ParkingType, Integer> typeToSpotCountMap) {
        System.out.println("Adding parking floor for building " + buildingId);
        int nFloors = this.parkingLot.getParkingFloors().size();
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setBuildingId(buildingId);
        parkingFloor.setFloorId(nFloors + 1);
        addSpots(typeToSpotCountMap, parkingFloor);
        this.parkingLot.getParkingFloors().put(nFloors +1,
                parkingFloor);
    }

    private void addSpots(Map<ParkingType, Integer> typeToSpotCountMap,
                          ParkingFloor parkingFloor
                          ) {
        for (Map.Entry<ParkingType, Integer> entry : typeToSpotCountMap.entrySet()) {
            System.out.println("Adding " + entry.getValue() + " " + entry.getKey() + " spots");
            int count = 0;
            while (count < entry.getValue()) {
                ParkingSpace space = new ParkingSpace();
                space.setFloor(parkingFloor.getFloorId());
                space.setBuildingId(parkingFloor.getBuildingId());
                space.setType(entry.getKey());
                space.setId(count + 1);

                ParkingSpacePOJO parkingSpacePOJO = parkingFloor.getParkingSpaceMap().get(entry.getKey());
                if (parkingSpacePOJO == null) {
                    parkingSpacePOJO = new ParkingSpacePOJO();
                    parkingFloor.getParkingSpaceMap().put(entry.getKey(), parkingSpacePOJO);
                }
                parkingSpacePOJO.getEmptySpaces().add(space);
                ++count;
            }

        }

    }

    public Ticket park(Vehicle vehicle) {
        System.out.println("Parking vehicle " + vehicle.getRegistrationNumber() + " of type " + vehicle.getType());

        Optional<ParkingSpace> space = findSpace(vehicle.getType());
        if (space.isPresent()) {
            System.out.println("Parking vehicle " + vehicle.getRegistrationNumber() + " in spot " + space.get().getId());
            Ticket ticket = new Ticket();
            ticket.setInTime(LocalDateTime.now());
            ticket.setVehicle(vehicle);
            ticket.setSpot(space.get());
            ticket.setId(String.join("_", space.get().getBuildingId(),
                    String.valueOf(space.get().getFloor()),
                    String.valueOf(space.get().getId())));

            // send event to dashboard
            dashboard.update(vehicle.getType(), true);
            System.out.println("Ticket generated " + ticket.getId());
            return ticket;
        }
        throw new RuntimeException("No slot found for type " + vehicle.getType().name());
    }

    public int unpark(Ticket ticket) {
        ParkingSpace space = ticket.getSpot();

        int floor = space.getFloor();

        this.parkingLot.getParkingFloors().get(floor).getParkingSpaceMap().get(space.getType())
                .getOccupiedSpaces().remove(space);
        this.parkingLot.getParkingFloors().get(floor).getParkingSpaceMap().get(space.getType())
                .getEmptySpaces().add(space);
        space.setOccupied(false);

        //send event to dashboard
        dashboard.update(space.getType(), false);

        LocalDateTime outTime = LocalDateTime.now();

        int charge = calculateCharge(space.getType(), ticket.getInTime(), outTime);

        System.out.println("Charging " + charge + " for ticket id " + ticket.getId());
        return charge;
    }

    private int calculateCharge(ParkingType type, LocalDateTime inTime, LocalDateTime outTime) {
        int baseRate = type.getBaseCharge();
        int hourlyRate = type.getPerHourCharge();

        int hours = (int) (outTime.toEpochSecond(ZoneOffset.UTC) - inTime.toEpochSecond(ZoneOffset.UTC)) / 3600;

        return baseRate + hourlyRate * hours;
    }

    private Optional<ParkingSpace> findSpace(ParkingType type) {
        for (ParkingFloor floor : this.parkingLot.getParkingFloors().values()) {
            if (!floor.getParkingSpaceMap().get(type).getEmptySpaces().isEmpty()) {
                ParkingSpace space = floor.getParkingSpaceMap().get(type).getEmptySpaces().remove(0);
                space.setOccupied(true);
                floor.getParkingSpaceMap().get(type).getOccupiedSpaces().add(space);
                return Optional.of(space);
            }
        }

        return Optional.empty();
    }


}
