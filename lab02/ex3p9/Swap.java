package lab02.ex3p9;

public class Swap {
    public static void main(String[] args) {
        test();
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        return true;
    }

    public static void swap(int[] array1, int[] array2, boolean isSwap) {
        if (isSwap) {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println("Before swap:");
        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("\nArray 2: ");
        printArray(array2);

        boolean isSwap = swap(array1, array2);

        swap(array1, array2, isSwap);

        System.out.println("\nAfter swap: ");
        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("\nArray 2: ");
        printArray(array2);
    }
}
