package lab02.ex3p8;

public class CopyArray {
    public static void main(String[] args) {
        test();
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array = {1, 2, 5, 6, 8};
        int[] res = copyOf(array);

        System.out.print("Input array: ");
        printArray(array);
        System.out.print("\nCopy array: ");
        printArray(res);
    }
}
