package com.jordan.game;

import java.util.Scanner;

public class RockPaperScissorsInfiniteTimes {
    public static void main(String[] args) {

        String loopResponse;
        String usersMove;
        String opponentsMove;
        int i = 0;
        System.out.println("Welcome to Rock, Paper, Scissors");
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.print("What is your move? To make a move, enter rock, paper, or scissors: ");
            int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);
            i++;

            usersMove = userInput.nextLine();


            if (usersMove.equalsIgnoreCase("rock")
                    || usersMove.equalsIgnoreCase("paper")
                    || usersMove.equalsIgnoreCase("scissors")) {

            } else {
                System.out.println("Your move is invalid!");
                System.out.println("Do you want to continue playing Y or N?");
                loopResponse = userInput.nextLine();
                if(loopResponse.equalsIgnoreCase("y")){
                    System.out.println("Let's play again!");
                    continue;

                } else if (loopResponse.equalsIgnoreCase("n")) {
                    System.out.println("This game is over!");
                    break;

                }
            }


            if (randomNumber == 1) {
                opponentsMove = "rock";
            } else if (randomNumber == 2) {
                opponentsMove = "paper";
            } else {
                opponentsMove = "scissors";
            }


            if (usersMove.equalsIgnoreCase(opponentsMove)) {
                System.out.println("It's a tie!");
            } else if ((usersMove.equalsIgnoreCase("rock")) && (opponentsMove.equalsIgnoreCase("scissors"))) {
                System.out.println("You win");

            } else if ((usersMove.equalsIgnoreCase("paper")) && (opponentsMove.equalsIgnoreCase("rock"))) {
                System.out.println("You win");

            } else if ((usersMove.equalsIgnoreCase("scissors")) && (opponentsMove.equalsIgnoreCase("paper"))) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
                System.out.println("Keep trying until you win!");
            }

            System.out.println("Your opponent chose " + opponentsMove);
            System.out.println("Do you want to try again? Y or N");
            loopResponse = userInput.nextLine();
            if(loopResponse.equalsIgnoreCase("y")){
                System.out.println("Let's play again!");
                continue;

            } else if (loopResponse.equalsIgnoreCase("n")) {
                System.out.println("This game is over!");
                break;

            }










        }
        while (i < 5) ;

    }
}