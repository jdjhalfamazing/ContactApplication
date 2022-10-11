package com.jordan.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int difference;
        System.out.println("Hello this is a simple subtraction calculator");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        numberOne = userInput.nextInt();

        System.out.println("Enter the second number: ");
        numberTwo =userInput.nextInt();

        difference = numberOne - numberTwo;
        System.out.println("The difference of " + numberOne + " " +  numberTwo + " is " +  difference);


    }
}
