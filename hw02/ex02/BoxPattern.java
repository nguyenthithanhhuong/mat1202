package hw02.ex02;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        sc.close();

        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);
    }

    public static void boxPatternA(int size) {
        System.out.printf("Box Pattern A (size = %d):", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == 0 || column == size - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int size) {
        System.out.printf("Box Pattern B (size = %d):", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == row)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int size) {
        System.out.printf("Box Pattern C (size = %d):", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == size - row - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int size) {
        System.out.printf("Box Pattern D (size = %d):", size);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == row || column == size - row - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }
}
