package com.jordan.oop;

public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override    public void draw() {
        System.out.println("Drawing a Circle with " + radius
                + " with fill color " + getFillColor()
                + " with line width " + getLineWidth());
    }
}