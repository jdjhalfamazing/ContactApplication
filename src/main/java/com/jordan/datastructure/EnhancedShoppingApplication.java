package com.jordan.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EnhancedShoppingApplication {

    public static void main(String[] args) {
        double sum = 0;
        String productCode;
        String productDescription;
        double productPrice;
        int availableToysLeft;
        HashMap<String, String> productsDescription = new HashMap<>();
        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> numberOfProductsAvailable = new HashMap<>();
        ArrayList<Integer> userSelectedToys = new ArrayList<>();
        printWelcomeMessage();
        productListMessage();

        ArrayList<String> listOfProducts = createProductList(productsDescription, productPrices, numberOfProductsAvailable);
        printProductList(productsDescription);
        //System.out.println("Here is a list of the toys we have available " + "\n" + productsDescription);

        captureUserInput();

    }

    /*do {


            if (numberOfProductsAvailable.containsKey(selection)) {
                listOfProducts.add(selection);
            }
            else {
                System.out.println("Invalid selection!");


            }
                System.out.println("Do you want to try again? Y or N");
                loopResponse = userInput.nextLine();

        }

            while (loopResponse.equalsIgnoreCase("Y")) ;


            for (String toyList : products) {
                double prices = numberOfProductsAvailable.get(toyList);
                sum = sum + prices;


            }
            System.out.println("The total bill is " + sum);*/

    private static void captureUserInput() {
        Scanner userInput = new Scanner(System.in);
        String continuedResponse = "Y";
        int userChoice;
        String continueInput;
        do {
            userInputMessage();
            userChoice = userInput.nextInt();
            if (userChoice < 1 || userChoice > 6) {
                System.out.println("Invalid Selection");
                System.out.println("Please choose a number between 1 and 6");
                userChoice = userInput.nextInt();




                }
            System.out.println("Do you want to make another selection? Y/N");
            Scanner continueChoice = new Scanner(System.in);
             continueInput = continueChoice.nextLine();

        }

            while (continueInput.equalsIgnoreCase(continuedResponse));
    }

    private static void printProductList(HashMap<String, String> productsDescription) {
        int count = 0;
        for(String product : productsDescription.keySet()){


            count++;
            System.out.println(count + " " + product + " - " + productsDescription.get(product));

        }
    }

    private static ArrayList<String> createProductList(HashMap<String, String> productsDescription, HashMap<String, Double> productPrices, HashMap<String, Integer> numberOfProductsAvailable) {
        double productPrice;
        int availableToysLeft;
        String productDescription;
        String productCode;
        ArrayList<String> listOfProducts = new ArrayList<>();

        listOfProducts.add("EDU,Education Prime Set,384.95,10");
        listOfProducts.add("CHRI,Christmas Tree,44.99,7");
        listOfProducts.add("FREI,Freight Train,199.99,6");
        listOfProducts.add("STUN,Stunt Arena,159.99,3");
        listOfProducts.add("HAND,Material Handler,149.99,2");
        listOfProducts.add("CAST,Castle Expansion Set,129.99,7");

        for (String inventoryInfo : listOfProducts) {
            String[] products = inventoryInfo.split(","); //split this string into pieces
            productCode = products[0];
            productDescription = products[1];
            productPrice = Double.valueOf(products[2]);
            availableToysLeft = Integer.valueOf(products[3]);
            productsDescription.put(productCode, productDescription);
            productPrices.put(productCode, productPrice);
            numberOfProductsAvailable.put(productCode, availableToysLeft);
           //System.out.println(Arrays.toString(productsDescription));

        }
        return listOfProducts;
    }

    static  void printWelcomeMessage(){
        System.out.println("Welcome to Joseph's Shopping");
    }
    static void productListMessage(){
        System.out.println("Here is a list of the toys we have available");
    }
    static void userInputMessage(){
        System.out.println("What is your toy selection you would like to purchase? Please select a number!");

    }
}