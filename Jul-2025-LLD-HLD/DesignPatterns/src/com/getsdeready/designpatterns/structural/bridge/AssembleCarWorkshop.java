package com.getsdeready.designpatterns.structural.bridge;

public class AssembleCarWorkshop implements Workshop {
    @Override
    public void work() {
        System.out.println("Assemble a car");
    }
}
