package hw02.ex05;

public class FibonacciInt {
    public static void main(String[] args) {
        fibonacciInt();
    }

    public static void fibonacciInt() {
        int i = 1;
        int fibonacci = 1;

        while (fibonacci < Integer.MAX_VALUE && fibonacci > 1) {
            System.out.println("The fibonacci of " + i + " is " + fibonacci);
            fibonacci = fibonacci(i);
            i++;
        }
    }

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}