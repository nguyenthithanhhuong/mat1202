package lab03.ex02;

public class BinarySearch {
    public static void main(String[] args) {
        testBinarySearch();
    }

    public static int binarySearchIndex(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearchIndex(array, key) == -1;
    }

    public static void testBinarySearch() {
        System.out.println("Test Binary Search:");
        int[] array = {1, 2, 9, 5, 6, 8};
        int key = 9;

        System.out.print("Original array: ");
        printArray(array);
        System.out.println("\nKey: " + key);

        System.out.print("Test binarySearch(): ");
        if (binarySearch(array, key)) {
            System.out.print("Original array have key");
        } else {
            System.out.print("Original array don't have key");
        }

        int result = binarySearchIndex(array, key);
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
