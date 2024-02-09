package com.getsdeready.concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableRunner runner = new CallableRunner(List.of(1, 2,3, 4));

        FutureTask<Integer> futureTask = new FutureTask<>(runner);
        new Thread(futureTask).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

        System.out.println(futureTask.get()); // blocking
    }

}

class CallableRunner implements Callable<Integer> {

    private List<Integer> nums;

    public CallableRunner(List<Integer> nums) {
        this.nums = nums;
    }

    @Override
    public Integer call() throws Exception {
        return nums.stream().reduce(0, (a, b) -> (a + b));
    }
}
