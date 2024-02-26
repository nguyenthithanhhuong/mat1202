package hw02.ex03;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
    }

    public static boolean isPalindromicWord(String str) {
        str = str.toLowerCase();
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        while (leftIdx < rightIdx) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }

    public static boolean isPalindromicPhrase(String str) {
        String str1 = "";
        str = str.toLowerCase();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (chars.indexOf(c) != -1) {
                str1 += c;
            }
        }
        return isPalindromicWord(str1);
    }

    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        sc.close();

        System.out.printf("\"%s\" %s a palindrome phrase",
                str, isPalindromicPhrase(str)? "is" : "is not");
        System.out.println("End test");
    }

    public static void  testPalindromicPhrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        sc.close();

        System.out.printf("\"%s\" %s a palindrome",
                str, isPalindromicWord(str)? "is" : "is not");
        System.out.println("End test");
    }
}
