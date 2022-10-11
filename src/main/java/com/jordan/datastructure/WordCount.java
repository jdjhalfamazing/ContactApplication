package com.jordan.datastructure;

import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String line = "this is a test";
        String[] words = line.split("\\W+");

        for(String word : words) {
            System.out.println(word);
        }

    }
}
