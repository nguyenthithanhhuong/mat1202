package lab02.ex3p2;

import java.util.Scanner;

public class HasEight {
    public static void main(String[] args) {
        test();
    }

    public static boolean hasEight(int num) {
        String numString = num + "";
        for (int index = 0; index < numString.length(); index++) {
            char c = numString.charAt(index);
            if (c == '8') {
                return true;
            }
        }
        return false;
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        int tempNum = 0;
        int sum = 0;
        do {
            System.out.print("Enter a integer (or -1 to end): ");
            tempNum = scanner.nextInt();
            if (hasEight(tempNum)) {
                sum += tempNum;
            }
        } while (tempNum != -1);
        scanner.close();

        System.out.printf("The magic sum is: %d", sum);
    }
}
