package com.jordan.math;

import java.sql.SQLOutput;

public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Here is a \"for\" loop for even numbers.");
        for (int num = 1; num <= 100; num++) {
            if (num % 2 ==0) {
                System.out.println(num + " is an even number.");
            }
        }
    }
}