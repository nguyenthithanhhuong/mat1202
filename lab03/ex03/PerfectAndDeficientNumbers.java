package lab03.ex03;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        test();
    }

    public static void printResult(int upperbound) {
        System.out.println("\nThese numbers are perfect:");
        int perfectNumCount = 0;
        for (int i = 1; i <= upperbound; i++) {
            if (isPerfect(i)) {
                perfectNumCount++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n",
                perfectNumCount, perfectNumCount * 100.0 / upperbound);

        int deficientNorPerfectCount = 0;
        System.out.println("\nThese numbers are neither deficient nor perfect:");
        for (int number = 1; number <= upperbound; number++) {
            if (!isPerfect(number) && isDeficient(number)) {
                deficientNorPerfectCount++;
                System.out.print(number + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]",
                deficientNorPerfectCount, deficientNorPerfectCount * 100.0 / upperbound);    }

    public static int sumDivisors(int num) {
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        return num == sumDivisors(num);
    }

    public static boolean isDeficient(int num) {
        return num < sumDivisors(num);
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = sc.nextInt();
        sc.close();

        printResult(upperbound);
    }
}
