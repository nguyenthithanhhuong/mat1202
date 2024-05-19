package lab10.strategy.ex03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 4, 8, 1, 2, 9};

        // Create context object
        SortContext context = new SortContext();

        // Bubble Sort
        context.setStrategy(new BubbleSort());
        context.sortArray(array.clone());
        System.out.println("Sorted using Bubble Sort: " + Arrays.toString(array));

        // Selection Sort
        context.setStrategy(new SelectionSort());
        context.sortArray(array.clone());
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(array));

        // Insertion Sort
        context.setStrategy(new InsertionSort());
        context.sortArray(array.clone());
        System.out.println("Sorted using Insertion Sort: " + Arrays.toString(array));
    }
}
