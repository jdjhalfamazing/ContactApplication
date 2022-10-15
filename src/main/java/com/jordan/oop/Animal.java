package com.jordan.oop;

public class Animal {
     String breed;
    String size;
    int age;
    String color;

    public Animal(String breed, String size, int age, String color) {   //should generate a constructor in the parent class and then use super method to use them in child class.
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("The " + breed + " is eating.");
    }
    public void sleep(){
        System.out.println("The " + breed + " is sleeping.");
    }
    public void sit(){
        System.out.println("The " + breed + " is sitting.");
    }
    public void run(){
        System.out.println("The " + breed + " is running.");
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
