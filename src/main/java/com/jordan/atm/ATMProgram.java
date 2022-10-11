package com.jordan.atm;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        int withdraw;
        int deposit;
        int balance = 55000;
        int decision;

        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Welcome to Joseph's ATM! \nPress 1 for withdraw; \nPress 2 for deposit; \nPress 3 for check your balance;");

            int atmUser = userInput.nextInt();

            if (atmUser == 1) {
                System.out.println("How much do you want to withdraw? ");
                withdraw = userInput.nextInt();

                if (balance >= withdraw) {
                    System.out.println("Withdraw successfully!");
                    balance = balance - withdraw;
                } else {
                    System.out.println("Insufficient Funds");
                }

            } else if (atmUser == 2) {
                System.out.println("How much do you want to deposit? ");
                deposit = userInput.nextInt();
                System.out.println("Deposit successfully!");
                balance = balance + deposit;

            } else if (atmUser == 3) {
                System.out.println("Your total balance is " + balance);

            } else {
                System.exit(0);
            }
            System.out.println("Do you want to continue? Enter 1 to continue or Enter 0 to exit");
            decision = userInput.nextInt();
        }

        while (decision != 0);
        System.out.println("Thank you! Have a good day!");
    }

}
