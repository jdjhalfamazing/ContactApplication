package com.jordan.oop;

public abstract class Shape {
    private int lineWidth;
    private String fillColor;

    protected int getLineWidth() {
        return lineWidth;
    }
    protected String getFillColor() {
        return fillColor;
    }

    public abstract double getArea();
    public abstract void draw();

}
