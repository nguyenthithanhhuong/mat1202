package hw02.ex01;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, sc);
        sc.close();
    }

    public static void guessNumber(int number, Scanner sc) {
        int guess;
        int trials = 0;

        System.out.println("Key in your guess:");

        do {
            guess = sc.nextInt();
            trials++;

            if (guess < number) {
                System.out.println("Try higher");
            } else if (guess > number) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + trials + " trials!");
            }
        } while (guess != number);
    }
}
