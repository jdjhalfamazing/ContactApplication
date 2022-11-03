package com.jordan.insurance;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InsuranceClaimsDashboard {

    public static void main(String[] args) {

    }



    private List<String> claimsData() {
        String fileName = "claims.csv";
        // variable to store all the claims from the file
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()){
                String claim = scanner.nextLine();

            }
        } catch (IOException e) {
        }

        // return claims data

        return claimsData();
    }

  /*

//code to split each line
        for (String eachDataRoll : listOfProducts) {
        String[] productDetail = product.split(","); //split this string into pieces */
   // String[] data = eachDataRoll.split()


          //Group the claims data by
     //   HashMap<String, ArrayList<String>> groupByClaimType =


}
