interface Command {
    void execute();
}

// ConcreteCommand
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class LightShimmerCommand implements Command {
    private Light light;

    public LightShimmerCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.shimmer();
    }
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
    
    public void shimmer() {
        System.out.println("Shimmering");
    }
}

// Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);

        // Pressing the button triggers the command
        remote.pressButton();

        Command lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOffCommand);
        
        remote.pressButton();

        Command lightShimmerCommand = new LightShimmerCommand(light);
        remote.setCommand(lightShimmerCommand);
        
        remote.pressButton();
    }
}
