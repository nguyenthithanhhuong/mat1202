package hw02.ex04;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        test();
    }

    public static void printArrayInStars(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%d: ", index);
            for (int count = 0; count < array[index]; count++) {
                System.out.print("*");
            }
            System.out.println("(" + array[index] + ")");
        }
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberItems = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        int[] array = new int[numberItems];
        for (int index = 0; index < numberItems; index++) {
            array[index] = sc.nextInt();
        }
        sc.close();

        printArrayInStars(array);
    }
}
