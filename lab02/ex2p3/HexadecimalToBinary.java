package lab02.ex2p3;

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a Hexadecimal string: ");
        String inStr = sc.nextLine();
        sc.close();

        if (checkHexStr(inStr) == true) {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", inStr);
            hex2Bin(inStr);
        }
    }

    public static boolean checkHexStr(String str) {
        int strLen = str.length();
        int count = 0;
        for (int i = 0; i < strLen - 1; i++) {
            char inChar = str.charAt(i);
            if (!((inChar > '0' && inChar < '9') || (inChar >= 'a' && inChar <= 'f') || (inChar >= 'A' && inChar <= 'F'))) {
                count++;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    public static void hex2Bin(String str) {
        int strLen = str.length();
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            int charIdx = ch - '0';
            switch (ch) {
                case 'a':
                case 'A':
                    charIdx = 10;
                    break;
                case 'b':
                case 'B':
                    charIdx = 11;
                    break;
                case 'c':
                case 'C':
                    charIdx = 12;
                    break;
                case 'd':
                case 'D':
                    charIdx = 13;
                    break;
                case 'e':
                case 'E':
                    charIdx = 14;
                    break;
                case 'f':
                case 'F':
                    charIdx = 15;
                    break;
            }
            System.out.print(HEX_BITS[charIdx] + " ");
        }
    }
}