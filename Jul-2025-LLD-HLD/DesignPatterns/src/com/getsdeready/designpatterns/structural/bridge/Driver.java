package com.getsdeready.designpatterns.structural.bridge;

// Implementer
public class Driver {

    public static void main(String[] args) {
        Vehicle car = new Car(new ManufactureCarWorkshop(), new AssembleCarWorkshop());

        // HW
        // Extend it for bike
        car.create();
    }
}
