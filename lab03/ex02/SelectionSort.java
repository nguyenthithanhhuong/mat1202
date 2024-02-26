package lab03.ex02;

public class SelectionSort {
    public static void main(String[] args) {
        testSelectionSort();
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void testSelectionSort() {
        System.out.println("Test Selection Sort:");
        int[] array = {12, 56, 82, 15, 10};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);

        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
