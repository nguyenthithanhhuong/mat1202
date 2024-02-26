package hw02.ex01;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        guessWord();
    }
    public static void guessWord() {
        Scanner sc = new Scanner(System.in);
        String guessedString = "testing";
        guessWord(guessedString, sc);
        sc.close();
    }

    public static void guessWord(String guessString, Scanner sc) {
        String target = guessString.toLowerCase();
        StringBuilder currentString = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            currentString.append("_");
        }

        int trials = 0;

        while (!currentString.toString().equals(target)) {
            System.out.print("Key in one character or your guess word: ");
            String guess = sc.nextLine().toLowerCase();

            if (guess.length() == 1) {
                char guessedChar = guess.charAt(0);
                boolean found = false;

                for (int i = 0; i < target.length(); i++) {
                    if (target.charAt(i) == guessedChar && currentString.charAt(i) == '_') {
                        currentString.setCharAt(i, guessedChar);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Character not found in the word.");
                }
                } else if (guess.equals(target) || currentString.equals(target)) {
                    System.out.println("Congratulations!");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter one character or your guess word.");
                }

            System.out.printf("Trial %d : %s\n", trials + 1, currentString);

            trials++;
        }
        System.out.printf("You got it in %d trials", trials + 1);
    }
}
