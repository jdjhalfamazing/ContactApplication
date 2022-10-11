package com.jordan.datastructure;
import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {

        // create a list
        ArrayList<String> tntHost = new ArrayList<>();

        // add items to the list
        tntHost.add("Kenny");
        tntHost.add("Charles");
        tntHost.add("Shaquille");
        tntHost.add("Ernie");
        System.out.println(tntHost.get(0));
        System.out.println(tntHost.get(2));
        // create a list
        ArrayList<String> bestInNba = new ArrayList<>();

        // add items to the list
        bestInNba.add("Kobe");
        bestInNba.add("Lebron");
        bestInNba.add("Stephen");
        bestInNba.addAll(tntHost);
        System.out.println("Names : " + bestInNba);

        // get the size of a list
        System.out.println("Number of Names : " + tntHost.size());

        // get an item from the list based on an index
        System.out.println("Element At Index 1 : " + tntHost.get(1));

        // remove an item from the list based on an index
        System.out.println("Removed Element At Index 1: " + tntHost.remove(1));

        // remove an item from the list based on a value
        System.out.println("Removed Sara: " + tntHost.remove("Sara"));

        System.out.println("Remaining Names : " + tntHost);

        // get the size of a list
        System.out.println("Number of Remaining Names : " + tntHost.size());
        tntHost.add(1,"Joe");
        tntHost.add(2,"sara");

        // iterate over a list
        for (String name : tntHost) {
            System.out.println("Name : " + name);
        }
    }
}

