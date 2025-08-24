package com.getsdeready.designpatterns.behavioral.command;

public class Driver {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightFlickerCommand lightFlickerCommand = new LightFlickerCommand(light);


        remoteControl.setCommand(lightOnCommand);
        remoteControl.execute();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.execute();

        remoteControl.setCommand(lightFlickerCommand);
        remoteControl.execute();
    }
}
