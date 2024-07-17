package main.java.task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100 - 1) + 1;
            int attempts = 0;
            int maxAttempt = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100.");
            System.out.println("You have 10 Trials");

            while (attempts < maxAttempt && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Correct! You've guessed the number in " + attempts + " trials.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've run out of trials! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
