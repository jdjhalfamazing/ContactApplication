package com.jordan.exercise;

import java.util.Arrays;

public class November2nd {
    public static void main(String[] args) {
        // declare an empty integer array of length = 4
       int[] arr = new int[4];

        // iterate of the array and print the value to console
        System.out.println(Arrays.toString(arr));
        for (int array : arr) {
            System.out.println(array);
        }
        // fill it with the number `3`
        arr = new int[] {3, 3, 3, 3};
        System.out.println(Arrays.toString(arr));

        // declare an empty integer array of length = 7
        int[] arr2 =  new int[7];
        arr2 =  new int[]{2,2,2,2,2,2,2};
        // fill it with the number `2`
        // reassign the second value in the array to the number `23`
        arr2[1] = 23;

        System.out.println(Arrays.toString(arr2));
        // print the array to the console

        // create an integer variable
        int var = 1;
        // create a second integer variable
        int var2 = 2;
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (var == var2) {
            System.out.println(var + var2);
        }
        else {
            System.out.println("The two variables are not equal");
        }

    }
}