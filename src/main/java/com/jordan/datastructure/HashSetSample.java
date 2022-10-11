package com.jordan.datastructure;


import java.util.HashSet;

public class HashSetSample {

        public static void main(String[] args) {

            // create a HashSet
            HashSet<String> names = new HashSet<>();

            // add items to the set
            names.add("John");
            names.add("Mary");
            names.add("Sara");

            // print the items in first set - order is not guaranteed
            System.out.println("Names - First Set: " + names);

            // Not Supported - Since Order Is Not Guarantees
            // names.add(3, "Lisa");

            // create another HashSet
            HashSet<String> names2 = new HashSet<>();

            // add items to the HashSet
            names2.add("Sara");
            names2.add("Lisa");
            names2.add("joseph");

            // print the items in second set - order is not guaranteed
            System.out.println("Names - Second Set: " + names2);

            // add all items from second set to the first set
            names.addAll(names2);

            // print the items in set - order is not guaranteed but duplicate is not allowed
            System.out.println("Names - First & Second Set - Duplicates Names Removed: " + names);


            System.out.println("Before Retains " + names);
            System.out.println("Names - Second Set" + names2);
            names.retainAll(names2);

            System.out.println("After retains - Only Keeps the Items That are Same Between Two Sets " + names);

            // Not Supported - Since Order Is Not Guarantees
            // System.out.println("Index For John " + names.indexOf("John"));

            System.out.println("Found Lisa " +  names.contains("Lisa".toLowerCase()));

            // Check if Lisa is in the Set
            String[] namesArray = {"Lisa", "Mary"};
            for(String name : namesArray) {
                if(name.equalsIgnoreCase("Lisa")) {
                    System.out.println("I Found Lisa " + name);
                }
            }

            // get the size of a set
            System.out.println("Number of Names : " + names.size());

            // Not Supported - Since Order Is Not Guarantees
            // get an item from the list based on an index
            // System.out.println("Element At Index 1 : " + names.get(1));

            // Not Supported - Since Order Is Not Guarantees
            // remove an item from the list based on an index
            // System.out.println("Removed Element At Index 1: " + names.remove(1));

            // remove an item from the set based on a value
            System.out.println("Removed Sara: " + names.remove("Sara"));

            System.out.println("Remaining Names : " + names);

            // get the size of the set
            System.out.println("Number of Remaining Names : " + names.size());

            // iterate over a set
            for(String name : names) {
                System.out.println("Name : " + name);
            }

        }
    }

