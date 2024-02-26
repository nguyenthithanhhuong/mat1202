package lab02.ex3p6;

public class Search {
    public static void main(String[] args) {
        test();
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        int[] array = {1, 2, 5, 6, 8};
        int key = 6;
        int res = search(array, key);

        System.out.print("Input array: ");
        printArray(array);
        System.out.println("\nKey: " + key);
        System.out.printf("%d at array index: %d", key, res);
    }
}
