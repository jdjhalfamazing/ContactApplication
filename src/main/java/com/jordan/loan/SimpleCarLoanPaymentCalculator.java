package com.jordan.loan;

import java.util.Scanner;

public class SimpleCarLoanPaymentCalculator {
    //Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        double carLoan = 20000;
        double carLoanLength = 3;
        int interestOnCarLoan = 3;
        double carLoanDownPayment = 3000;
        double carLoanBalance = carLoan;
        double carLoanLengthInMonths;
        double carLoanMonthlyPayments;
        double interestMonthlyPayments;
        double totalInterest;
        double userMonthlyPayment;
        String wantCarOrNot;
        // Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to to Joseph's Car Loan, let's take out a loan");

        if (carLoanLength > 0) {
            System.out.println("This action is valid");
        } else {
            System.out.println("This is invalid");
        }

        if (interestOnCarLoan > 0) {
            System.out.println("This action is valid");
        } else {
            System.out.println("This action is invalid");
        }
        if (carLoanDownPayment > carLoan) {
            System.out.println("This action is invalid");
        } else {
            System.out.println("This action is valid");
        }
        if (carLoanDownPayment == carLoan) {
            System.out.println("The car loan is paid in full");
        }

        carLoanBalance = carLoanBalance - carLoanDownPayment;
        System.out.println("The car loan balance is: " + carLoanBalance);
        carLoanLengthInMonths = interestOnCarLoan * 12;
        carLoanMonthlyPayments = carLoanBalance / carLoanLengthInMonths;

        totalInterest= (carLoan * interestOnCarLoan) /100;
        interestMonthlyPayments = totalInterest/carLoanLengthInMonths;
        userMonthlyPayment = carLoanMonthlyPayments + interestMonthlyPayments;

        System.out.println("Your monthly payments for your car loan is: " + userMonthlyPayment);

    }


}





