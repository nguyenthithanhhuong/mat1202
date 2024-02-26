package lab01.ex4p1;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int num3 = sc.nextInt();
        sc.close();

        System.out.printf("The sum is: %d\n", sum(num1, num2, num3));
        System.out.printf("The product is: %d\n", product(num1, num2, num3));
        System.out.printf("The min is: %d\n", min(num1, num2, num3));
        System.out.printf("The max is: %d", max(num1, num2, num3));
    }

    public static int sum(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static int product(int num1, int num2, int num3) {
        return num1*num2*num3;
    }

    public static int min(int num1, int num2, int num3) {
        int temp = Math.min(num1, num2);
        return Math.min(temp, num3);
    }

    public static int max(int num1, int num2, int num3) {
        int temp = Math.max(num1, num2);
        return Math.max(temp, num3);
    }
}
