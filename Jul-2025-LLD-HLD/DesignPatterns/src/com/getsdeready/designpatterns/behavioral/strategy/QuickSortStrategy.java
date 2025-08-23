package com.getsdeready.designpatterns.behavioral.strategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("Sort using Quick sort strategy");
    }
}
