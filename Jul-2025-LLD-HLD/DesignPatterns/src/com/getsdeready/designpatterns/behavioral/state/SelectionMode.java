package com.getsdeready.designpatterns.behavioral.state;

// Concrete STATE
public class SelectionMode implements EditingMode {

    @Override
    public void handleKeyClick() {
        System.out.println("Key clicked in SELECTION mode");
    }

    @Override
    public void handleKeyPress() {
        System.out.println("Key pressed in SELECTION mode");
    }
}
