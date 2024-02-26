package lab01.ex4p5;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        sc.close();

        System.out.printf("The reverse is: %s", reverseInt(num));
    }

    public static String reverseInt(int num) {
        String result = "";
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}