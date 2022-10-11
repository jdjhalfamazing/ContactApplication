package com.jordan.calculator;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int difference;

        System.out.println("Hey, this is a difference calculator");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your first number");
        numberOne = userInput.nextInt();

        System.out.println("Enter your second number");
        numberTwo = userInput.nextInt();

        if (numberOne > numberTwo) {
            difference =  numberOne - numberTwo;
            System.out.println("The difference between " + numberOne + " and " + numberTwo  + " is " + difference);
        } else {
            difference =  numberTwo - numberOne;
            System.out.println("The difference between " + numberTwo + " and " + numberOne  + " is " + difference);
        }




    }
}
