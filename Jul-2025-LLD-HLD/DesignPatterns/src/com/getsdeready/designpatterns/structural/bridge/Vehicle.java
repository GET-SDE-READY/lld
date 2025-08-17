package com.getsdeready.designpatterns.structural.bridge;

// Abstraction
public abstract class Vehicle {

    protected Workshop manufacturingWorkshop;
    protected Workshop assemblyWorkshop;

    protected Vehicle(Workshop manufacturingWorkshop, Workshop assemblyWorkshop) {
        this.manufacturingWorkshop = manufacturingWorkshop;
        this.assemblyWorkshop = assemblyWorkshop;
    }

    abstract public void create();
}
