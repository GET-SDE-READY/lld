package com.getsdeready.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        MyDeadlockThread1 thread1 = new MyDeadlockThread1(lock, lock2);
        MyDeadlockThread2 thread2 = new MyDeadlockThread2(lock, lock2);
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();
    }


}

class MyDeadlockThread1 extends Thread {

    private ReentrantLock object;
    private ReentrantLock object2;

    public MyDeadlockThread1(ReentrantLock object, ReentrantLock object2) {
        this.object = object;
        this.object2 = object2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                if (object.tryLock()) {
                    object.lock();
                    if (object2.tryLock()) {
                        object2.lock();

                        System.out.println("Thread " + this.getName() + " is running " + i);

                        object2.unlock();
                    }
                    object.unlock();
                }
            System.out.println("Thread " + this.getName() + " is exiting " + i);
        }
    }
}

class MyDeadlockThread2 extends Thread {

    private ReentrantLock object;
    private ReentrantLock object2;

    public MyDeadlockThread2(ReentrantLock object, ReentrantLock object2) {
        this.object = object;
        this.object2 = object2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                if (object.tryLock()) {
                    object.lock();
                    if (object2.tryLock()) {
                        object2.lock();

                        System.out.println("Thread " + this.getName() + " is running " + i);

                        object2.unlock();
                    }
                    object.unlock();
                }
                System.out.println("Thread " + this.getName() + " is exiting " + i);
        }
    }
}
