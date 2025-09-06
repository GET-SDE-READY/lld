package com.getsdeready.lld.elevator;

public class ProcessJobWorker implements Runnable {

    private Elevator elevator;

    public ProcessJobWorker(Elevator elevator) {
        this.elevator = elevator;
    }

    // start elevator as a separate thread
    @Override
    public void run() {
        elevator.startElevator();
    }
}
