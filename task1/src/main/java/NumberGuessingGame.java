package main.java;

// src/NumberGuessingGame.java
import java.util.Random;
        import java.util.Scanner;

public class NumberGuessingGame {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've run out of attempts! The number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}