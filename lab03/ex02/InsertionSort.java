package lab03.ex02;

public class InsertionSort {
    public static void main(String[] args) {
        testInsertionSort();
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void testInsertionSort() {
        System.out.println("Test Insertion Sort:");
        int[] array = {12, 56, 82, 15, 10};

        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

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
