package com.jordan.fitness;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        int weight;
        int height;
        int age;
        int bmi = 0;
        double bodyFat;
        System.out.println("We will first find your BMI and then we will find your bodyfat percentage.");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        height = userInput.nextInt();
        System.out.print("Enter your weight in pounds: ");
        weight = userInput.nextInt();
        System.out.print("What is your age? ");
        age = userInput.nextInt();

        bmiCalculation2(weight, height);
        bodyFatCalculation(bmi, age);


    }

    public static void bodyFatCalculation(int bmi, int age){
        double bodyFat = (1.20 * bmi) / (0.23 * age) - 16.2;
        System.out.println("Your bodyfat is: "+ bodyFat);
    }
    public static void bmiCalculation2(int weight, int height) {
        double bmi = (weight * 730) / (height * height );
       /* Category	BMI Range
        Underweight	< 18.5
        Normal	18.5 - 25
        Overweight	25 - 30
        Obese	> 30 */
        System.out.println("Your BMI is " + bmi);
        if(bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if ((bmi > 18.5 ) && (bmi <= 25)) {
            System.out.println("Your weight is normal.");
        } else if ((bmi > 25) && ( bmi <= 30)){
            System.out.println("You are overweight.");
        }
        else {
            System.out.println("Sorry, you are obese.");
        }
    }





    private static void bmiCalculation(int weight, int height) {
        if((height == 60) && (weight < 130)) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 60) && ((weight >= 130) && (weight < 150))) {
            System.out.println("You are overweight");
        }
        else if ((height == 60) && (weight > 150)) {
            System.out.println("You are obese");
        }


        else if ((height == 61) && (weight < 135)) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 61) && ((weight >= 135) && (weight < 155))) {
            System.out.println("You are overweight");
        }
        else if ((height == 61) && (weight > 155)) {
            System.out.println("You are obese");
        }


        else if ((height == 62) && (weight < 105)) {
            System.out.println("You are underweight");
        }
        else if ((height == 62) && ((weight >= 105) && (weight < 135))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 62) && ((weight >= 140) && (weight < 160))) {
            System.out.println("You have overweight");
        }
        else if ((height == 62) && (weight > 160)) {
            System.out.println("You are obese");
        }


        else if ((height == 63) && (weight < 105)) {
            System.out.println("You are underweight");
        }
        else if ((height == 63) && ((weight >= 105) && (weight < 140))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 63) && ((weight >= 145) && (weight < 165))) {
            System.out.println("You are overweight");
        }
        else if ((height == 63) && (weight > 165)) {
            System.out.println("You are obese");
        }

        else if ((height == 64) && (weight < 110)) {
            System.out.println("You are underweight");
        }
        else if ((height == 64) && ((weight >= 110) && (weight < 145))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 64) && ((weight >= 150) && (weight < 170))) {
            System.out.println("You are overweight");
        }
        else if ((height == 64) && (weight > 170)) {
            System.out.println("You are obese");
        }

        else if ((height == 65) && (weight < 115)) {
            System.out.println("You are underweight");
        }
        else if ((height == 65) && ((weight >= 115) && (weight < 145))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 65) && ((weight >= 150) && (weight < 175))) {
            System.out.println("You are overweight");
        }
        else if ((height == 65) && (weight > 175)) {
            System.out.println("You are obese");
        }

        else if ((height == 66) && (weight < 115)) {
            System.out.println("You are underweight");
        }
        else if ((height == 66) && ((weight >= 115) && (weight < 150))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 66) && ((weight >= 155) && (weight < 185))) {
            System.out.println("You are overweight");
        }
        else if ((height == 66) && (weight > 185)) {
            System.out.println("You are obese");
        }

        else if ((height == 67) && (weight < 120)) {
            System.out.println("You are underweight");
        }
        else if ((height == 67) && ((weight >= 120) && (weight < 155))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 67) && ((weight >= 160) && (weight < 190))) {
            System.out.println("You are overweight");
        }
        else if ((height == 67) && (weight > 190)) {
            System.out.println("You are obese");
        }

        else if ((height == 68) && (weight < 125)) {
            System.out.println("You are underweight");
        }
        else if ((height == 68) && ((weight >= 125) && (weight < 160))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 68) && ((weight >= 165) && (weight < 195))) {
            System.out.println("You are overweight");
        }
        else if ((height == 68) && (weight > 195)) {
            System.out.println("You are obese");
        }

        else if ((height == 69) && (weight < 125)) {
            System.out.println("You are underweight");
        }
        else if ((height == 69) && ((weight >= 125) && (weight < 165))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 69) && ((weight >= 170) && (weight < 200))) {
            System.out.println("You are overweight");
        }
        else if ((height == 69) && (weight > 200)) {
            System.out.println("You are obese");
        }

        else if ((height == 70) && (weight < 130)) {
            System.out.println("You are underweight");
        }
        else if ((height == 70) && ((weight >= 130) && (weight < 170))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 70) && ((weight >= 175) && (weight < 205))) {
            System.out.println("You are overweight");
        }
        else if ((height == 70) && (weight > 205)) {
            System.out.println("You are obese");
        }

        else if ((height == 71) && (weight < 135)) {
            System.out.println("You are underweight");
        }
        else if ((height == 71) && ((weight >= 135) && (weight < 175))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 71) && ((weight >= 180) && (weight < 210))) {
            System.out.println("You are overweight");
        }
        else if ((height == 71) && (weight > 210)) {
            System.out.println("You are obese");
        }

        else if ((height == 72) && (weight < 140)) {
            System.out.println("You are underweight");
        }
        else if ((height == 72) && ((weight >= 140) && (weight < 180))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 72) && (weight > 180)){
            System.out.println("You are overweight");
        }

        else if ((height == 73) && (weight < 140)) {
            System.out.println("You are underweight");
        }
        else if ((height == 73) && ((weight >= 140) && (weight < 185))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 73) && (weight > 185)){
            System.out.println("You are overweight");
        }

        else if ((height == 74) && (weight < 145)) {
            System.out.println("You are underweight");
        }
        else if ((height == 74) && ((weight >= 145) && (weight < 190))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 74) && (weight > 190)){
            System.out.println("You are overweight");
        }

        else if ((height == 75) && (weight < 150)) {
            System.out.println("You are underweight");
        }
        else if ((height == 75) && ((weight >= 145) && (weight < 195))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 75) && (weight > 195)){
            System.out.println("You are overweight");
        }

        else if ((height == 76) && (weight < 155)) {
            System.out.println("You are underweight");
        }
        else if ((height == 76) && ((weight >= 155) && (weight < 200))) {
            System.out.println("You have a healthy weight");
        }
        else if ((height == 76) && (weight > 200)){
            System.out.println("You are overweight");
        }
    }
}

