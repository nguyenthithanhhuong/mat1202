package hw02.ex02;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        triangularA(size);
        triangularB(size);
        triangularC(size);
        triangularD(size);
    }

    public static void triangularA(int size) {
        System.out.printf("Triangular A (size = %d): ", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < row + 1; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularB(int size) {
        System.out.printf("Triangular B (size = %d): ", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size - row; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularC(int size) {
        System.out.printf("Triangular C (size = %d): ", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularD(int size) {
        System.out.printf("Triangular D (size = %d): ", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size - row - 1; column++) {
                System.out.print("  ");
            }
            for (int column = size - row - 1; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
