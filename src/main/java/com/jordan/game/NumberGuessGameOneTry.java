package com.jordan.game;

import java.util.Scanner;

public class NumberGuessGameOneTry {
    public static void main(String[] args) {
        int userNumber;
        int randomNumber =  (int) ((Math.random() * (100 - 1)) + 1);

        System.out.println("A number is chosen between 1 to 100. Guess the number within 1 try");
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your guess on what the number is?");
        userNumber = userInput.nextInt();
        System.out.println("The number that was chosen is " + randomNumber);
        if(userNumber > randomNumber ){
            System.out.println("Your are too high");
        } else if (userNumber < randomNumber) {
            System.out.println("You are too low ");
        }
        else{
            System.out.println("You are right on the money");
        }


    }
}
