package lab03.ex01;

public class Fibonacci {
    public static void main(String[] args) {
        test();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void test() {
        int number = 6;
        for (int i = 0; i < number; i++) {
            System.out.printf("F(%d) = %d\n", i, fibonacci(i));
        }
    }
}
