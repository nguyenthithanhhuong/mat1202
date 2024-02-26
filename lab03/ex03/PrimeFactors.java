package lab03.ex03;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        test();
    }

    public static void printResult(int upperbound) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= upperbound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d primes found (%.2f%%)]",
                count, count * 100.0 / upperbound);
    }

    public static boolean isProductOfPrimeFactors(int num) {
        int product = 1;
        for (int value = 2; value <= num / 2; value++) {
            if (isPrime(value) && num % value == 0) {
                product *= value;
            }
        }
        return num == product;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = sc.nextInt();
        sc.close();

        printResult(upperbound);
    }
}
