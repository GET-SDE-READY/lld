package com.getsdeready.concurrency;

public class ThreadSharing {

    public static void main(String[] args) {
        Resource resource = new Resource(5);
        IncrementThread incrementThread = new IncrementThread(resource);
        DecrementThread decrementThread = new DecrementThread(resource);

        incrementThread.start();
        decrementThread.start();
    }
}

class IncrementThread extends Thread {
    private Resource count;

    public IncrementThread(Resource count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (count) {
            while (count.count < 10) {
                count.count++;
                System.out.println("IncrementThread : " + count.count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class DecrementThread extends Thread {
    private Resource count;

    public DecrementThread(Resource count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (count) {
            while (count.count > 0) {
                count.count--;
                System.out.println("Decrement Thread " + count.count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Resource {
    public Integer count;

    public Resource(Integer count) {
        this.count = count;
    }
}
