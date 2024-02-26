package hw02.ex03;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        test();
    }

    public static String ciphertext(String plainText) {
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            cipherText += convertChar(plainText.charAt(i));
        }
        return cipherText;
    }

    public static char convertChar(char ch) {
        return (char)('A' + 'Z' - ch);
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = sc.next().toUpperCase();
        sc.close();

        System.out.printf("The ciphertext string is: %s", ciphertext(str));
    }
}
