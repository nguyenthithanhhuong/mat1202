package lab02.ex3p7;

public class Equals {
    public static void main(String[] args) {
        test();
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array1 = {1, 2, 5, 6, 8};
        int[] array2 = {1, 2, 5, 4, 8};
        boolean res = equals(array1, array2);

        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("\nArray 2: ");
        printArray(array2);
        System.out.printf("\nArray 1 equals array 2? %s", res);
    }
}
