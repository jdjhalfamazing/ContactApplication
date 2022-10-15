package com.jordan.oop;

public class Cat extends Animal {


    public Cat(String breed, String size, int age, String color){
        super(breed, size, age, color);

    }

    public static void main(String[] args) {
        Dog clifford = new Dog("German Sheppard", "big",12, "red");
        clifford.eat();
        clifford.sleep();
        clifford.sit();
        clifford.run();
    }



}
