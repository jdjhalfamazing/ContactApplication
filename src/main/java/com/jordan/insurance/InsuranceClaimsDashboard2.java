package com.jordan.insurance;

import java.io.File;
import java.io.IOException;
import java.util.*;

    public class InsuranceClaimsDashboard2 {

        //Load Claims Data From A File. Given
        private ArrayList<String> claimsData() { //create a method to load data
            String filename = "C:/Users/jamie/Downloads/claims.csv";
            ArrayList<String> claimData = new ArrayList<>(); // variable to store all the claims from the file
            int rowNumber = 1;
            try (Scanner scanner = new Scanner(new File(filename))) {
                while (scanner.hasNext()) {
                    String claim = scanner.nextLine();
                    if (rowNumber != 1) {
                        claimData.add(claim);
                    }
                    rowNumber++;
                }
            } catch (IOException e) {
            }
            return claimData; //return data
        }

        public void printList(HashMap<String, ArrayList<String>> claimsMap) {
            System.out.println("Using forEach");
            claimsMap.forEach( (claimsKey, claimsData) -> {
                System.out.println("The type is: " + claimsKey + ", value: " + claimsData);
                System.out.println("The size of this claim type is :" + claimsData.size());

            });
        }

        public void calculation(HashMap<String, ArrayList<String>> claimsMap) {
            System.out.println("Using forEach");
            claimsMap.forEach( (claimsKey, claimsData) -> { //loop through map
                double sum = 0.0;
                for (String items : claimsData) { //inner for loop, for each entry in the map, looping through each value list
                    String [] item = items.split(",");
                    Double claimAmount = Double.valueOf(item[6]);
                    sum += claimAmount;
                }
                System.out.println("The type is: " + claimsKey + " ; The amount is: " + sum);

            });
        }

        public void highestAmount (HashMap<String, ArrayList<String>> claimsMap) {
            System.out.println("Using forEach");
            claimsMap.forEach( (claimsKey, claimsData) -> { //loop through map

                ArrayList<Double> highestAmount = new ArrayList<>();

                for (String items : claimsData) { //inner for loop, for each entry in the map, looping through each value list
                    String[] item = items.split(",");
                    Double claimAmount = Double.valueOf(item[6]);
                    highestAmount.add(claimAmount);

                }

                Double max = Collections.max(highestAmount);
                System.out.println("The type is: " + claimsKey + " ; The highest amount is: " + max);

            });

        /* alternative method:
        Double highestAmount2 =0.0;
        for (String items : claimsData) {
                String [] item = items.split(",");
                Double claimAmount = Double.valueOf(item[6]);
                highestAmount.add(claimAmount);

                if (claimAmount > highestAmount2) {
                    highestAmount2 = claimAmount;
                }
            }
         */
        }

        public static void main(String[] args) {
            //create an instance of the class before you can call it
            InsuranceClaimsDashboard2 insuranceData = new InsuranceClaimsDashboard2();

            //create a variable to store the return from claimData method
            ArrayList<String> claimsData = insuranceData.claimsData();
            //insuranceData.claimsData();
            //to call a method


            //Group the claims data by
            HashMap<String, ArrayList<String>> groupByClaimType = new HashMap<>();

            HashMap<String, ArrayList<String>> groupByClaimStatus = new HashMap<>();

            HashMap<String, ArrayList<String>> groupByGender = new HashMap<>();

            HashMap<String, ArrayList<String>> groupByMonth = new HashMap<>();


            //Code to split each line
            for (String eachDataRoll : claimsData) {

                String[] data = eachDataRoll.split(",");
                String claimId = data[0];
                String claimMonth = data[1];
                String policyHolder = data[2];
                int age = Integer.valueOf(data[3]);
                String gender = data[4];
                String claimType = data[5];
                Double claimAmount = Double.valueOf(data[6]);
                String claimStatus = data[7];


                ArrayList<String> claimsByType = groupByClaimType.get(claimType); //build up the groupbytype hashmap
                if (claimsByType == null) {
                    claimsByType = new ArrayList<>();//initize clainbytype to an empty list
                }
                claimsByType.add(eachDataRoll); //add eachDateRoll to Arraylist<String>
                groupByClaimType.put(claimType, claimsByType); //add claimtype and the just-buit arraylist back to the relavant hashMaps


                ArrayList<String> claimsByStatus = groupByClaimStatus.get(claimStatus);
                if (claimsByStatus == null) {
                    claimsByStatus = new ArrayList<>();
                }
                claimsByStatus.add(eachDataRoll);
                groupByClaimStatus.put(claimStatus, claimsByStatus);


                ArrayList<String> claimsByGender = groupByGender.get(gender);
                if (claimsByGender == null) {
                    claimsByGender = new ArrayList<>();//initize clainbytype to an empty list
                }
                claimsByGender.add(eachDataRoll);
                groupByGender.put(gender, claimsByGender);


                ArrayList<String> claimsByMonth = groupByMonth.get(claimMonth);
                if (claimsByMonth == null) {
                    claimsByMonth = new ArrayList<>();//initize claimbytype to an empty list
                }
                claimsByMonth.add(eachDataRoll);
                groupByMonth.put(claimMonth, claimsByMonth);

            }
            //Provide the number of claims b

            /*System.out.println("Using forEach");
            groupByClaimType.forEach( (claimType, claimByTypeList) -> {
            System.out.println("key: " + claimType + ", value: " + claimByTypeList);
            System.out.println(claimByTypeList.size());
            });*/


            insuranceData.printList(groupByClaimType);
           /* insuranceData.printList(groupByClaimStatus);
            insuranceData.printList(groupByGender);
            insuranceData.printList(groupByMonth);*/


            //Print All
            System.out.println("Print claim type: " + groupByClaimType.keySet());
            System.out.println("Print claim status: " + groupByClaimStatus.keySet());
            System.out.println("Print claim gender: " + groupByGender.keySet());
            System.out.println("Print claim month: " + groupByMonth.keySet());


            //Print All sorted
            TreeSet<String> claimTypeSorted = new TreeSet<>(groupByClaimType.keySet());
            TreeSet<String> claimStatusSorted = new TreeSet<>(groupByClaimStatus.keySet());
            TreeSet<String> claimByGenderSorted = new TreeSet<>(groupByGender.keySet());
            TreeSet<String> claimByMonthSorted = new TreeSet<>(groupByMonth.keySet());


            //Calculate
            insuranceData.calculation(groupByClaimType);
            insuranceData.calculation(groupByClaimStatus);
            insuranceData.calculation(groupByGender);
            insuranceData.calculation(groupByMonth);


            //Provide the highest amount for
            insuranceData.highestAmount(groupByClaimType);
            insuranceData.highestAmount(groupByClaimStatus);
            insuranceData.highestAmount(groupByGender);
            insuranceData.highestAmount(groupByMonth);



        }

    }

