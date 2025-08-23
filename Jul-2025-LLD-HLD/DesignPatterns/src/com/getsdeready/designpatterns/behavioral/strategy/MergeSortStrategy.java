package com.getsdeready.designpatterns.behavioral.strategy;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("Sorting using Merge sort");
    }
}
