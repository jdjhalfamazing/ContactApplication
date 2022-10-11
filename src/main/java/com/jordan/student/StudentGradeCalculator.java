package com.jordan.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};


        String[] students = {"Henry", "Rose", "Amy"};
        int[] grades = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.println("Enter a student's name:");

        String selectedStudentName = userInput.nextLine();

        if(selectedStudentName.equalsIgnoreCase("Henry")) {
            grades = studentOneGrades;
        }
        else if (selectedStudentName.equalsIgnoreCase("Rose")) {
            grades = studentTwoGrades;
        }
        else if (selectedStudentName.equalsIgnoreCase("Amy")) {
            grades = studentThreeGrades;
        }
        else {
            System.out.println("There is no student with that name");
            System.exit(1);
        }

        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;

        }

        double numberOfGrades = grades.length;
        double average = sum/numberOfGrades;

        System.out.println("Sum " + sum);
        System.out.println("Average " + average);



String grade = " ";

       if(average >= 90){
         grade = "A";

        }
        else if (average >= 80) {
           grade = "B";

        }

        else if (average >= 70) {
           grade = "C";

        }

        else if (average >= 60) {
           grade = "D";

        }
        else{
           grade = "F";

        }
        System.out.println(grade);


        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Well Done");
                break;
            case "C":
                System.out.println("You Passed");
                break;
            case "D":
                System.out.println("Try Again");
                break;
            case "F":
                System.out.println("Try Again");
                break;


        }


    }
}
