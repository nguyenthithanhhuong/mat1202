package lab02.ex1p2;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputStr = sc.nextLine();
        sc.close();

        int vowels = countVowelsDigits(inputStr);
        double percentVowels = percentVowels(inputStr);
        int digits = countDigits(inputStr);
        double percentDigits = percentDigits(inputStr);

        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowels, percentVowels);
        System.out.printf("Number of digits: %d (%.2f%%)", digits, percentDigits);
    }

    public static int countDigits(String inputStr) {
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (!(ch >= '0' && ch <= '9')) count++;
        }
        return count;
    }

    public static int countVowelsDigits(String inputStr) {
        inputStr = inputStr.toLowerCase();
        int numberOfDigits = countDigits(inputStr);
        int count = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            char ch = inputStr.charAt(i);
            if (ch == 'u' || ch == 'e' || ch == 'o'
                    || ch == 'a' || ch == 'i') count++;
        }
        return count;
    }

    public static double percentVowels(String inputStr) {
        int vowels = countVowelsDigits(inputStr);
        return vowels * 100.0 / inputStr.length();
    }

    public static double percentDigits(String inputStr) {
        int digits = countDigits(inputStr);
        return digits * 100.0 / inputStr.length();
    }
}
