package com.getsdeready.designpatterns.behavioral.command;

public class LightFlickerCommand implements Command {

    private final Light light;

    public LightFlickerCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.flicker();
    }
}
