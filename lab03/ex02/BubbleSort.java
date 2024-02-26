package lab03.ex02;

public class BubbleSort {
    public static void main(String[] args) {
        testBubbleSort();
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void testBubbleSort() {
        System.out.println("Test Bubble Sort:");
        int[] array = {12, 56, 82, 15, 10};

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

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
