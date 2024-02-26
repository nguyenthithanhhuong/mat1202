package hw02.ex02;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        drawSquareUsingForLoop(size);
        drawSquareUsingWhileDoLoop(size);
    }

    public static void drawSquareUsingForLoop(int size) {
        System.out.println("Draw square using for-loop, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawSquareUsingWhileDoLoop(int size) {
        System.out.println("Draw square using while-do loop, size = " + size + ":");
        int row = 0;
        while (row++ < size) {
            int column = 0;
            while (column++ < size) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
