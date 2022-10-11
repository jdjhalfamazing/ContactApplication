package com.jordan.atm;

import java.util.Scanner;

public class AtmProgramSwitchAndMethod {

    public int withdrawal(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("Withdraw successfully!");


        } else {
            System.out.println("Insufficient Funds");
        }
        return balance;
    }

    public int depositAmount(int balance, int deposit) {
        balance = balance + deposit;
        System.out.println("Deposit successfully!");
        return balance;

}



    public static void main(String[] args) {

        int withdraw;
        int deposit = 0;
        int balance = 55000;
        int decision;

        AtmProgramSwitchAndMethod atm = new AtmProgramSwitchAndMethod();

        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Welcome to Joseph's ATM! \nPress 1 for withdraw; \nPress 2 for deposit; \nPress 3 for check your balance;");

            int atmUser = userInput.nextInt();


            switch (atmUser){
                case 1:
                    System.out.println("How much do you want to withdraw? ");
                    withdraw = userInput.nextInt();
                    balance = atm.withdrawal(balance,withdraw);
                    break;
                case 2:
                    System.out.println("How much do you want to deposit? ");
                    deposit = userInput.nextInt();
                    balance = atm.depositAmount(balance,deposit);
                    break;
                case 3:
                    System.out.println("Your total balance is " + balance);
                    break;


            }
            System.out.println("Do you want to continue? Enter 1 to continue or Enter 0 to exit");
            decision = userInput.nextInt();
        }

        while (decision != 0);
        System.out.println("Thank you! Have a good day!");


    }

}