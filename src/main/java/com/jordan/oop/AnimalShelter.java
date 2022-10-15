package com.jordan.oop;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();

    public void shelterAnAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feed(){
        for(Animal dog : animals) {

        }
    }



    public static void main(String[] args) {
        Dog clifford = new Dog("German Sheppard", "big",12, "red");
        clifford.eat();
        clifford.sleep();
        clifford.sit();
        clifford.run();

        clifford.getBreed();
    }
}
