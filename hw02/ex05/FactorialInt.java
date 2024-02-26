package hw02.ex05;

public class FactorialInt {
    public static void main(String[] args) {
        factorialInt();
    }

    public static void factorialInt() {
        int i = 1;
        int factorial = 1;

        while (factorial <= Integer.MAX_VALUE && factorial >= 1) {
            factorial = factorial(i);
            System.out.println("The factorial of " + i + " is " + factorial);
            i++;
        }
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
