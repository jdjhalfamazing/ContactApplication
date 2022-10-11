package com.jordan.inheritance;

public class Lion extends Animal {
    private String eyeColor;
    public Lion(String color, String eyeColor){
        super(color);
        this.eyeColor = eyeColor;

    }

    @Override
    public void eat(){
        System.out.println("I am a lion eating");

    }

    public void roar(){

    }

    @Override
    public String toString() {
        return "Lion{" +
                "eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
