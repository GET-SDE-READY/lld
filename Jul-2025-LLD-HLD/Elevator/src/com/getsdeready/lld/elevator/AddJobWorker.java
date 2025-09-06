package com.getsdeready.lld.elevator;

import com.getsdeready.lld.elevator.model.Request;

public class AddJobWorker implements Runnable {

    private final Elevator elevator;
    private final Request request;

    public AddJobWorker(Elevator elevator, Request request) {
        this.elevator = elevator;
        this.request = request;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elevator.addJob(request);
    }

}
