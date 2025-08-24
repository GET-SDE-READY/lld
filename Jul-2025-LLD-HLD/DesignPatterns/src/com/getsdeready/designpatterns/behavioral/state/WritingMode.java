package com.getsdeready.designpatterns.behavioral.state;

public class WritingMode implements EditingMode {

    @Override
    public void handleKeyClick() {
        System.out.println("Key clicked in WRITING mode");
    }

    @Override
    public void handleKeyPress() {
        System.out.println("Key pressed in WRITING mode");
    }
}
