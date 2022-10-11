package com.jordan.datastructure;

import java.util.*;

public class SetCompareDemo {


        public static void main(String[] args) {
            int[] numberArray = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
            HashSet<Integer> numberHashSet = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                numberHashSet.add(numberArray[i]);
            }
            System.out.println(numberHashSet);
            TreeSet<Integer> sorted = new TreeSet<>(numberHashSet);
            System.out.println("Sorted list = ");
            System.out.println(sorted);


            HashSet<String> fruitsStore = new HashSet<>();
            LinkedHashSet<String> fruitMarket = new LinkedHashSet<>();
            TreeSet<String> fruitBuzz = new TreeSet<>();

            List<String> fruits = new ArrayList<>();
            fruits.add("mango");
            fruits.add("apple");
            fruits.add("banana");

            for(String fruit: fruits){
                fruitsStore.add(fruit);
                fruitMarket.add(fruit);
                fruitBuzz.add(fruit);
            }

            //no ordering in HashSet – elements stored in random order
            System.out.println("Ordering in HashSet :" + fruitsStore);

            //insertion order or elements – LinkedHashSet stored elements as insertion
            System.err.println("Order of element in LinkedHashSet :" + fruitMarket);

            //should be sorted order – TreeSet stores element in sorted order
            System.out.println("Order of objects in TreeSet :" + fruitBuzz);


            //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
            Set<Integer> numbers = new HashSet<>();
            long startTime = System.nanoTime();
            for(int i =0; i<10000000; i++){
                numbers.add(i);
            }

            long endTime = System.nanoTime();
            System.out.println("Total time to insert 10M elements in HashSet in sec : "
                    + (endTime - startTime));


            // LinkedHashSet performance Test – inserting 10M objects
            numbers = new LinkedHashSet<>();
            startTime = System.nanoTime();
            for(int i =0; i<10000000; i++){
                numbers.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("Total time to insert 10M elements in LinkedHashSet in sec : "
                    + (endTime - startTime));

            // TreeSet performance Test – inserting 10M objects
            numbers = new TreeSet<>();
            startTime = System.nanoTime();
            for(int i =0; i<10000000; i++){
                numbers.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("Total time to insert 10M elements in TreeSet in sec : "
                    + (endTime - startTime));


        }

    }

