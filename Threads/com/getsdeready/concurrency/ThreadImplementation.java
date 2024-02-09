package com.getsdeready.concurrency;

public class ThreadImplementation {

    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // new
        Runnable myRunnable = new MyRunnable();
        Thread myThread2 = new Thread(myRunnable); // new

        myThread.setPriority(10);
        myThread2.setPriority(1);

        System.out.println("Main is running");
        myThread.start();
        myThread2.start();


        // main thread waits till completion of thread execution
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Thread is running " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Runnable is running " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}