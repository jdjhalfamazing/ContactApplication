package com.jordan.datastructure;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class WordCount {
    public static void main(String[] args) {
        String line1 = "Nothing is so necessary for a young man as the company of intelligent women.";
        String line2 = "The strongest of all warriors are these two — Time and Patience.";
        String line3 = "If everyone fought for their own convictions there would be no war.";
        String line4 = "There is no greatness where there is not simplicity, goodness, and truth.";
        String line5 = "A limit has been set to human life, which cannot be overstepped";
        String line6 = "Well, what makes you go to war?";
        HashMap<String, Integer> numberOfOccurences = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        WordCount wordCount = new WordCount();
        // String line = "this is a test";



        list.add(line1);
        list.add(line2);
        list.add(line3);
        list.add(line4);
        list.add(line5);
        list.add(line6);
        ArrayList<String> words = wordCount.getAllWords(list);
        HashMap<String, Integer> newWordCount = wordCount.getNumberOfOccurences(words);
        System.out.println(words);
        int sum = words.size();
        System.out.println(sum);
        System.out.println(newWordCount);
        TreeSet<String> alphaWords = new TreeSet<>(words);
        System.out.println(alphaWords);
    }

   public ArrayList<String> getAllWords(ArrayList<String> lines) {
        ArrayList<String> allWords = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.split("\\W+");
            for (String word : words) {
                allWords.add(word);

            }

        }

       return allWords;
   }


   public HashMap<String, Integer> getNumberOfOccurences(ArrayList<String> words) {
        HashMap<String, Integer> wordName = new HashMap<>();


        for (String aWord : words) {
            System.out.println(aWord);
            if (wordName.containsKey(aWord)) {
                Integer wordCount = wordName.get(aWord);
                wordCount = wordCount +1;
                wordName.put(aWord, wordCount);
            } else {
                wordName.put(aWord, 1);
            }
        }
       return wordName;
   }

}
