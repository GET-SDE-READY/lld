package com.getsdeready.lld.elevator;

import com.getsdeready.lld.elevator.model.Direction;
import com.getsdeready.lld.elevator.model.Request;
import com.getsdeready.lld.elevator.model.State;

import java.util.TreeSet;

public class Elevator {

    private int currentFloor = 0;
    private Direction currentDirection = Direction.UP;
    private State currentState = State.IDLE;

    // All these are sorted in ascending order
    private TreeSet<Request> currentJobs = new TreeSet<>();
    private TreeSet<Request> upPendingJobs = new TreeSet<>();
    private TreeSet<Request> downPendingJobs = new TreeSet<>();


    public void startElevator() {
        System.out.println("Starting elevator");
        while (true) {
            // Check if job exists in current pool
            if (checkIfJobExists()) {
                System.out.println("Check direction of movement");
                // check the direction of movement
                if (currentDirection == Direction.UP) {
                    System.out.println("Start job processing for first job");
                    // Poll first job from the current job pool sorted in ascending order because of treeset
                    Request request = currentJobs.pollFirst();

                    // process
                    processUpRequest(request);

                    // check if other jobs are available
                    if (currentJobs.isEmpty()) {
                        // reverse direction if no UP jobs are left
                        addPendingDownJobsToCurrentJobs();
                    }
                }
            }
        }
    }

    private void addPendingDownJobsToCurrentJobs() {
        if (!downPendingJobs.isEmpty()) {
            currentJobs = downPendingJobs;
            currentDirection = Direction.DOWN;
        } else {
            currentState = State.IDLE;
        }
    }

    private void processUpRequest(Request request) {
        int startFloor = currentFloor;

        // move to the source floor
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            // Move to source floor

            for (int i = startFloor; i < request.getExternalRequest().getSourceFloor(); ++i) {
                try {
                    // mimic elevator movement time
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("We have reached floor -- " + i);
                currentFloor = i;

                if (checkIfNewJobCanBeProcessed(request)) {
                    break;
                }
            }
        }
        // we can put some sleep here to mimic opening and closing of door;
        currentState = State.STOPPED;


        System.out.println("Reached source floor -- Opening door");

        startFloor = currentFloor;

        currentState = State.MOVING;
        // move to the destination floor
        for (int i = startFloor; i < request.getInternalRequest().getDestinationFloor(); ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("We have reached floor -- " + i);
            currentFloor = i;

            // check if any new UP job can be processed
            if (checkIfNewJobCanBeProcessed(request)) {
                break;
            }
        }

        System.out.println("We have reached destination floor -- " + request.getInternalRequest().getDestinationFloor());
    }

    private boolean checkIfNewJobCanBeProcessed(Request currentRequest) {
        if (checkIfJobExists()) {
            if (currentDirection == Direction.UP) {
                Request newRequest = currentJobs.pollFirst();

                // if new request wants to go at a lower floor, we need to add both jobs back into the job pool
                if (newRequest.getInternalRequest().getDestinationFloor() < currentRequest.getInternalRequest().getDestinationFloor()) {
                    currentJobs.add(newRequest);
                    currentJobs.add(currentRequest); // adding job back as it was polled out but we are not completing it yet because of the other job
                    return true;
                }

                // The newRequest wants to go at a higher floor, so just add it to current pool
                currentJobs.add(newRequest);
            }

        }

        // return false if no new job can be processed right now
        return false;
    }

    private boolean checkIfJobExists() {
        return !currentJobs.isEmpty();
    }

    // Lift is at 4
    // ExternalRequest(1, UP)
    // Lift will move down, pick the person and then move up

    public void addJob(Request request) {
        System.out.println("Adding job");

        if (currentState == State.IDLE) {
            currentState = State.MOVING;
            // not entirely correct
            // actually the current direction should be as per the current floor and the source floor from external request
            currentDirection = getDirectionToGoForIdleState(request, currentFloor);
            System.out.println("Job added to current pool");
            currentJobs.add(request);
        } else if (currentState == State.MOVING || currentState == State.STOPPED) {
            if (request.getExternalRequest().getDirectionToGo() != currentDirection) {

                // add to pending jobs
                addToPendingJobs(request);
            } else if (request.getExternalRequest().getDirectionToGo() == currentDirection) {
                if (currentDirection == Direction.UP && request.getInternalRequest().getDestinationFloor() < currentFloor) {
                    // cannot process as we have already passed this floor
                    // add to pending jobs
                    System.out.println("Job added to pending pool");
                    addToPendingJobs(request);
                } else if (currentDirection == Direction.DOWN && request.getInternalRequest().getDestinationFloor() > currentFloor) {
                    // cannot process as we have already passed this floor
                    // add to pending jobs
                    System.out.println("Job added to pending pool");
                    addToPendingJobs(request);
                } else {
                    System.out.println("Job added to current pool");
                    currentJobs.add(request);
                }
            }
        }
    }

    private Direction getDirectionToGoForIdleState(Request request, int currentFloor) {
        if (currentFloor < request.getExternalRequest().getSourceFloor()) {
            return Direction.DOWN;
        }
        return Direction.UP;
    }

    private void addToPendingJobs(Request request) {
        if (request.getExternalRequest().getDirectionToGo() == Direction.UP) {
            upPendingJobs.add(request);
        } else {
            downPendingJobs.add(request);
        }
    }
}
