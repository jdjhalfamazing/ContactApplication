package com.jordan.oop;

public class Dog extends Animal {

    public Dog(String breed, String size, int age, String color){  //cannot inherent constructor
        super(breed, size, age, color);

    }

    public static void main(String[] args) {
    Dog clifford = new Dog("German Sheppard", "big",12, "red");
    Dog joey = new Dog("Pit-bull","Small", 11, "brown");
    clifford.eat();
    clifford.sleep();
    joey.eat();
    joey.sleep();
    }







}
