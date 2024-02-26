package hw02.ex02;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        drawCheckerPattern(size);
    }

    public static void drawCheckerPattern(int size) {
        System.out.println("Draw checker pattern using for-loop, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print(row % 2 == 0? "# " : " #");
            }
            System.out.println();
        }
    }
}
