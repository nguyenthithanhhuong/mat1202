package lab03.ex02;

public class LinearSearch {
    public static void main(String[] args) {
        testLinearSearch();
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearch(int[] array, int key) {
        return linearSearchIndex(array, key) == -1;
    }

    public static void testLinearSearch() {
        System.out.println("Test Linear Search:");
        int[] array = {1, 2, 9, 5, 6, 8};
        int key = 9;

        System.out.print("Original array: ");
        printArray(array);
        System.out.println("\nKey: " + key);

        System.out.print("Test linearSearch(): ");
        if (linearSearch(array, key)) {
            System.out.print("Original array have key");
        } else {
            System.out.print("Original array don't have key");
        }

        int result = linearSearchIndex(array, key);
        if (result != -1) {
            System.out.printf("\nIn array, key %d at index %d", key, result);
        } else {
            System.out.println("\nKey not in array");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
