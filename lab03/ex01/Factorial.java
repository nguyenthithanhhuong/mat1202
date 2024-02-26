package lab03.ex01;

public class Factorial {
    public static void main(String[] args) {
        test();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void test() {
        int number = 5;
        int result = factorial(number);
        System.out.printf("Factorial of %d is %d", number, result);
    }
}
