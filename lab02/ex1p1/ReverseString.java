package lab02.ex1p1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputStr = sc.nextLine();
        sc.close();

        String outputStr = reverseString(inputStr, inputStr.length());
        System.out.printf("The reverse of the String \"%s\" is \"%s\"", inputStr, outputStr);
    }
    public static String reverseString(String str, int lengthStr) {
        String result = "";
        for (int i = lengthStr - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
