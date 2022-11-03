package com.jordan.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EnhancedShopping2 {
    public static void main(String[] args) {
        ArrayList<String> listOfProducts = new ArrayList<>();
        ArrayList<String> shoppingList = new ArrayList<>();
       // ArrayList<String> shoppingListProductDescription = new ArrayList<>();

        HashMap<String, String> productsDescription = new HashMap<>();
        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> numberOfProductsAvailable = new HashMap<>();
        double sum = 0;
        String productCode;
        String productDescription;
        Double productPrice;
        String selection;
        Double price;
        String description = null;

        Scanner userInput = new Scanner(System.in);

        listOfProducts.add("EDU,Education Prime Set,384.95,10");
        listOfProducts.add("CHRI,Christmas Tree,44.99,7");
        listOfProducts.add("FREI,Freight Train,199.99,6");
        listOfProducts.add("STUN,Stunt Arena,159.99,3");
        listOfProducts.add("HAND,Material Handler,149.99,2");
        listOfProducts.add("CAST,Castle Expansion Set,129.99,7");


        for (String product : listOfProducts) {
            String[] productDetail = product.split(","); //split this string into pieces
            productCode = productDetail[0];
            productDescription = productDetail[1];
            productPrice = Double.valueOf(productDetail[2]);
            Integer availableProducts = Integer.valueOf(productDetail[3]);

            productsDescription.put(productCode, productDescription);
            productPrices.put(productCode, productPrice);
            numberOfProductsAvailable.put(productCode, availableProducts);
        }

        System.out.println("Welcome to the Toy Shopping Store!");
        System.out.println(productsDescription);
        String doneShopping = "Yes";


        do {
            System.out.println("Provide your selection please!");
            selection = userInput.nextLine();
            if (productsDescription.containsKey(selection)) {
                System.out.println("We found the product");
                int stockProductsAvailable = numberOfProductsAvailable.get(selection);
                System.out.println("We have " + stockProductsAvailable + " products in stock");
                if (stockProductsAvailable >= 1) {
                    int updatedStockProducts = stockProductsAvailable - 1;
                    numberOfProductsAvailable.put(selection, updatedStockProducts);
                    System.out.println("We have your product in stock");
                    System.out.println(numberOfProductsAvailable);
                    shoppingList.add(selection);

                } else {
                    System.out.println("Sorry, we don't have your product");
                }

            } else {
                System.out.println("The selection is invalid");


            }
            System.out.println("Do you want to shopping with us Yes or No?");
            doneShopping = userInput.nextLine();


        }
        while (doneShopping.equalsIgnoreCase("Yes"));
        System.out.println("Do you want to remove a selection?");
        String removeQuestion = userInput.nextLine();
        if (removeQuestion.equalsIgnoreCase("Yes")) {
            System.out.println("Which toy do you want to remove?");
            System.out.println(shoppingList);
            String removeSelection = userInput.nextLine();
            if (shoppingList.contains(removeSelection)) {
                System.out.println("Lets remove this toy for you!");
                shoppingList.remove(removeSelection);
            }


        }
        for (String toyList : shoppingList) {
            Double prices = productPrices.get(toyList);
            sum = sum + prices;
        }
        System.out.println("The final prices is " + sum);

      for (String shoppingItem : shoppingList) {

          System.out.println(productsDescription.get(shoppingItem));

        }


    }
}