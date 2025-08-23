package com.getsdeready.designpatterns.behavioral.strategy;

public class Driver {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        SortingContext sortingContext = new SortingContext();

        sortingContext.performSort(nums);


        sortingContext.setSortingStrategy(new BubbleSortStrategy());
        sortingContext.performSort(nums);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort(nums);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        sortingContext.performSort(nums);
    }
}
