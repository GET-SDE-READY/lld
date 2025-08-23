package com.getsdeready.designpatterns.behavioral.strategy;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("Sorting using Bubble sort");
    }
}
