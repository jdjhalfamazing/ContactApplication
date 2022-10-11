package com.jordan.inheritance;

public abstract class Animal {
    private String color;
    public Animal(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public abstract void eat();
}
