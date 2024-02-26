package lab02.ex3p3;

public class Print {
    public static void main(String[] args) {
        test();
    }

    public static void print(double[] array) {
        String res = arrayString(array);
        System.out.println(res);
    }

    public static String arrayString(double[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i]).append(", ");
        }
        result.append(array[array.length - 1]).append("]");
        return result.toString();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void test() {
        double[] array = {2.3, 4.5, 6.8, 6.9, 3.6};
        System.out.print("Input array: ");
        printArray(array);

        System.out.print("\nOutput: ");
        print(array);
    }
}
