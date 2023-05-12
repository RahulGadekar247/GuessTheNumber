package com.gtn.number;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int range = 100; 
        int attempts = 5; 
        int rounds = 3; 
        int playerScore = 0; 
        int computerNumber, userGuess;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("You have " + attempts + " attempts to guess the number.");
        System.out.println("There will be " + rounds + " rounds in total.");
        
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i);
            computerNumber = random.nextInt(range) + 1;
            int attempt = 1;
            
            while (attempt <= attempts) {
                System.out.print("Enter your guess (1-" + range + "): ");
                userGuess = input.nextInt();
                
                if (userGuess == computerNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    playerScore += attempts - (attempt - 1);
                    break;
                } else if (userGuess < computerNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                
                attempt++;
                
                if (attempt > attempts) {
                    System.out.println("Sorry, you ran out of attempts. The number was " + computerNumber + ".");
                }
            }
        }
        
        System.out.println("\nGame over! Your final score is " + playerScore + " out of " + (attempts * rounds) + ".");
        input.close();
    }

}
