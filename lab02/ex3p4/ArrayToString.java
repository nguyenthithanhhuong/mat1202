package lab02.ex3p4;

public class ArrayToString {
    public static void main(String[] args) {
        test();
    }

    public static String arrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array = {1, 2, 5, 6, 8};
        System.out.print("Input array: ");
        printArray(array);
        System.out.println("\nOutput");
        System.out.println(arrayToString(array));
    }
}
