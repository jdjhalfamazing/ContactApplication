package com.jordan.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SimpleShoppingCartProgramHashmap {


    public static void main(String[] args) {
        double sum = 0;
        int i = 0;

        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Double> legoSet = new HashMap<>();
        ArrayList<String> toyPurchaseList = new ArrayList<>();
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
        String loopResponse;

        do {
            System.out.println("What is your toy selection you would like to purchase?");

            String selection = userInput.nextLine();


            if (legoSet.containsKey(selection)) {
                toyPurchaseList.add(selection);
            } else {
                System.out.println("Invalid selection!");
            }

            System.out.println("Do you want to try again? Y or N");
            loopResponse = userInput.nextLine();


//just a comment

        }

        while (loopResponse.equalsIgnoreCase("Y"));

        for(String toyList   : toyPurchaseList){
            double prices = legoSet.get(toyList);
            sum = sum + prices;


        }
        System.out.println("The total bill is " + sum);
    }
}

