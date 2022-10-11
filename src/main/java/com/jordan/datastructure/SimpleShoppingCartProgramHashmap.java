package com.jordan.datastructure;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleShoppingCartProgramHashmap {


    public static void main(String[] args) {

        int i = 0;

        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Double> legoSet = new HashMap<>();
        System.out.println("Welcome to Joseph's Shopping Cart!");

        // Adding elements to the Map
        legoSet.put("Education Prime Set", 384.95);
        legoSet.put("Christmas Tree", 44.99);
        legoSet.put("Freight Train", 199.99);
        legoSet.put("Stunt Arena", 159.99);
        legoSet.put("Material Handler", 149.99);
        legoSet.put("Castle Expansion Set", 129.99);

        System.out.println("The list of Lego Sets for sale are: " + legoSet);
        Scanner userInput = new Scanner(System.in);


        do {
            System.out.println("What is your toy selection you would like to purchase?");

            i++;

            String selection = userInput.nextLine();
            if (selection.equalsIgnoreCase("Education Prime Set")
                    || selection.equalsIgnoreCase("Christmas Tree")
                    || selection.equalsIgnoreCase("Freight Train")
                    || selection.equalsIgnoreCase("Stunt Arena")
                    || selection.equalsIgnoreCase("Material Handler")
                    || selection.equalsIgnoreCase("Castle Expansion Set")) {
                System.out.println("Congratulations we have your toy selection!");

                System.out.println("Do you want to try again? Y or N");
                String loopResponse = userInput.nextLine();

                if (loopResponse.equalsIgnoreCase("y")) {
                    System.out.println("Let's make another selection!");
                    continue;

                } else if (loopResponse.equalsIgnoreCase("n")) {
                    System.out.println("It was a pleasure shopping with you!");
                    break;

                }


            } else {
                System.out.println("Your selection is invalid!");
                System.out.println("Do you want to make another selection Y or N?");
                String loopResponse = userInput.nextLine();
                if (loopResponse.equalsIgnoreCase("y")) {
                    System.out.println("Welcome to Joseph's Shopping Cart!");
                    continue;

                } else if (loopResponse.equalsIgnoreCase("n")) {
                    System.out.println("It was a pleasure shopping with you!");
                    break;

                }

            }
//just a comment

        }
        while (i < 5);

    }
}

