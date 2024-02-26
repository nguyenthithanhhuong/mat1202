package lab02.ex3p5;

public class Contains {
    public static void main(String[] args) {
        test();
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return true;
        }
        return false;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array = {1, 2, 5, 6, 8};
        int key = 6;
        boolean res = contains(array, key);

        System.out.print("Input array: ");
        printArray(array);
        System.out.println("\nKey: " + key);
        System.out.printf("Is input array contains %d?: %s", key, res);
    }
}
