package lab02.ex2p1;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int num = sc.nextInt();
        String input = "";
        System.out.print("Enter the value of all items: ");
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            input += value;
        }
        sc.close();
        String result = "[";
        for (int i = 0; i < num - 1; i++) {
            result += input.charAt(i) + ", ";
        }
        result += input.charAt(num - 1) + "]";
        System.out.print("the values are: " + result);
    }
}
