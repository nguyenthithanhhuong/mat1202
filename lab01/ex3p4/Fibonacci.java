package lab01.ex3p4;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 20;

        System.out.println("The first 20 Fibonacci numbers are:");
        for (int i = 1; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.printf("\nThe average is %.2f", averageFibonacci(num));
    }

    public static int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static double averageFibonacci(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += fibonacci(i);
        }
        return sum*1.0/num;
    }
}
