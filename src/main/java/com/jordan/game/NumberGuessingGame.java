package com.jordan.game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) ((Math.random() * (100 - 1)) + 1);
        int userNumber;
        System.out.println("A random number from 1 - 100 has been selected. Guess the exact number with five tries.");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, select the number.");
        for (int i = 0; i < 5; i++) {
            userNumber = userInput.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Congrats! Your guess is the right number.");
                break;
            }
            else if (userNumber < randomNumber) {
                System.out.println("Your number is too low");
            }
            else {
                System.out.println("Your number is too high");
            }

        }
        System.out.println("The correct guessing number was " +  randomNumber + ". "  + "Try again next time!");
    }
}




