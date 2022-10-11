package com.jordan.arraylistprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculatorArrayList {


    public static void main(String[] args) {

        // create a list
        //  ArrayList<String> disciples = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();


        // add items to the list
          /*  disciples.add("John");
            disciples.add("Mathew");
            disciples.add("Luke");
            disciples.add("Mark"); */


        Scanner grade = new Scanner(System.in);
        int average;
        int sum = 0;
        /*for(int i : grades){
            System.out.println("Grades : " + i);
        } */



        // System.out.println("Names : " + disciples);
      //  System.out.println("Grades : ");


        System.out.println("How many grades do you want to enter?");
        int numOfGrades = grade.nextInt();
        for (int i = 0; i < numOfGrades; i++ ){
            System.out.println("Now can you enter your grade");
            int eachGrade = grade.nextInt();
            grades.add(eachGrade);
            sum = sum + grades.get(i);

        }
        System.out.println(grades);
        System.out.println(sum);
        average = sum/numOfGrades;
        System.out.println(average);

        if (average >= 90) {
            System.out.println("Congrats you made an A!");
        }
        else if (average >= 80) {
            System.out.println("Good Job, you made a B!");
        }
        else if (average >= 70) {
            System.out.println("You made a C, you did average!");
        }
        else if (average >= 60) {
            System.out.println("You need to study more, you made a D!");
        }
        else  {
            System.out.println("You need a tutor, you made an F!");
        }


        // get the size of a list
        //  System.out.println("Number of Names : " + disciples.size());

        // get an item from the list based on an index
        //  System.out.println("Element At Index 1 : " + disciples.get(1));

        // remove an item from the list based on an index
        //  System.out.println("Removed Element At Index 1: " + disciples.remove(1));

        // remove an item from the list based on a value
        // System.out.println("Removed Sara: " + disciples.remove("Sara"));

        // System.out.println("Remaining Names : " + disciples);

        // get the size of a list
        // System.out.println("Number of Remaining Names : " + disciples.size());

        // iterate over a list
           /* for(String name : disciples) {
                System.out.println("Name : " + name);
            } */
    }
}
