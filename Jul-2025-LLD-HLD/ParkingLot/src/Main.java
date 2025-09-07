import com.getsdeready.parkinglot.ParkingLot;
import com.getsdeready.parkinglot.model.*;
import com.getsdeready.parkinglot.strategy.DynamicFareCalculationStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setParkingType(ParkingType.TWO_WHEELER);
        parkingSpot.setFloor(1);

        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setFloorId(1);
        parkingFloor.addParkingSpot(parkingSpot);

        Dashboard dashboard = new Dashboard();
        dashboard.getVacantSpots().put(ParkingType.TWO_WHEELER, 1);
        dashboard.getOccupiedSlots().put(ParkingType.TWO_WHEELER, 0);

        ParkingLot parkingLot = new ParkingLot(
                new DynamicFareCalculationStrategy(),
                dashboard);

        parkingLot.addParkingFloor(parkingFloor);

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType(ParkingType.TWO_WHEELER);
        vehicle.setRegNumber("XYZ");

        Ticket ticket = parkingLot.park(vehicle);
        dashboard.display();

        Double charge = parkingLot.unpark(ticket);
        dashboard.display();
        System.out.println("Fare " + charge + " for vehicle " + vehicle.getRegNumber());

    }
}