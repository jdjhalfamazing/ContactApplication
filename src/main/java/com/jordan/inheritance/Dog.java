package com.jordan.inheritance;

public class Dog extends Animal {
    private String owner;
    public Dog(String color, String owner){
        super(color);
        this.owner = owner;

    }

    @Override
    public void eat(){
        System.out.println("I am a dog eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
