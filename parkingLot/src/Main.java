import com.parking.lot.model.Dashboard;
import com.parking.lot.model.ParkingLot;
import com.parking.lot.model.ParkingType;
import com.parking.lot.model.Ticket;
import com.parking.lot.model.Vehicle;
import com.parking.lot.service.ParkingService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Dashboard dashboard = new Dashboard();

        ParkingService parkingService = new ParkingService(parkingLot, dashboard);

        parkingService.addParkingFloor("building1",
                Map.of(ParkingType.CAR, 10, ParkingType.BIKE, 20, ParkingType.TRUCK, 5));

        Vehicle vehicle = new Vehicle();
        vehicle.setType(ParkingType.CAR);
        vehicle.setRegistrationNumber("ABC10HSGE");

        Ticket ticket = parkingService.park(vehicle);
        dashboard.display();

        parkingService.unpark(ticket);
        dashboard.display();

    }
}


