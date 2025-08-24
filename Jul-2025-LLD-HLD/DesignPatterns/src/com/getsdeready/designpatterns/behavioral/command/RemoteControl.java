package com.getsdeready.designpatterns.behavioral.command;

// INVOKER
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
