// Strategy interface
interface SortingStrategy {
    void sort(int[] data);
}

// ConcreteStrategy implementations
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using Bubble Sort");
        // Implementation of Bubble Sort algorithm
    }
}

class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using Quick Sort");
        // Implementation of Quick Sort algorithm
    }
}

class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting using Merge Sort");
        // Implementation of Merge Sort algorithm
    }
}

// Context
class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] data) {
        sortingStrategy.sort(data);
    }
}
