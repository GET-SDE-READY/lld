public class BridgeDemo {
    public static void main(String[] args) {
        Remote remote = new Remote(new TV());
        remote.togglePower();
        remote.togglePower();
    }
}

interface Device {
    boolean isOn();
    void turnOn();
    void turnOff();

}

class TV implements Device {

    private boolean isOn = false;

    @Override
    public boolean isOn() {
        if (isOn)
            System.out.println("TV is on");
        else
            System.out.println("TV is off");
        return isOn;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning TV On");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning TV Off");
        isOn = false;
    }
}

class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (this.device.isOn()) {
            this.device.turnOff();
        } else {
            this.device.turnOn();
        }
    }
}



