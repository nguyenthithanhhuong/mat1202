package lab02.ex3p10;

public class Reverse {
    public static void main(String[] args) {
        test();
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array1 = {1, 2, 3, 4};

        System.out.print("Array : ");
        printArray(array1);

        reverse(array1);

        System.out.print("\nArray reverse: ");
        printArray(array1);
    }
}
