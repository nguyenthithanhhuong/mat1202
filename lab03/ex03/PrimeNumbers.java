package lab03.ex03;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        test();
    }

    public static void printResult(int upperbound) {
        int primeNums = 0;
        for (int i = 1; i <= upperbound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNums++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]",
                primeNums, primeNums * 100.0 / upperbound);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int value = 2; value <= Math.sqrt(n); value++) {
            if (n % value == 0) {
                return false;
            }
        }
        return true;
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperbound = sc.nextInt();
        sc.close();

        printResult(upperbound);
    }
}