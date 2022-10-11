package com.jordan.inheritance;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Dog Clifford = new Dog("red", "Joseph");
        Dog Joey = new Dog("brown", "Joseph");
        Lion Simba = new Lion("brown", "blue");


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(Clifford);
        animals.add(Joey);
        animals.add(Simba);
        System.out.println(animals);

        for(Animal animal : animals){
            animal.eat();
        }
    }
}
