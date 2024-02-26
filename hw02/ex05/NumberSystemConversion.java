package hw02.ex05;

import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        test();
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix < 2 || inRadix > 36 || outRadix < 2 || outRadix > 36) {
            throw new IllegalArgumentException("Invalid Radix (between 2 and 36)!");
        }

        try {
            int decimalValue = Integer.parseInt(in, inRadix);
            return Integer.toString(decimalValue, outRadix);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid.");
        }
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String input = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        sc.close();

        String converted = toRadix(input, inRadix, outRadix);

        System.out.println("\"" + input + "\" in radix " + inRadix + " is \"" + converted + "\" in radix " + outRadix + ".");
    }
}
