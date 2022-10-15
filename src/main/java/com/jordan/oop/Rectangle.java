package com.jordan.oop;


public class Rectangle extends  Shape {

    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width " + width + " height" + height
                + " with fill color " + getFillColor()
                + " with line width " + getLineWidth());
    }
}