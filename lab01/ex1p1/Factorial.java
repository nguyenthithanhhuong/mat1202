package lab01.ex1p1;

public class Factorial {
    public static void main(String[] args) {
        long n = 20;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.printf("The factorial of %d is %d", n, factorial);
    }
}
