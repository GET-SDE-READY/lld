package com.getsdeready.designpatterns.behavioral.strategy;

public class SortingContext {

    private SortingStrategy sortingStrategy;

    public SortingContext() {
        // Default strategy
        this.sortingStrategy = new BubbleSortStrategy();
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] nums) {
        this.sortingStrategy.sort(nums);
    }
}
