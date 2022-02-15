package com.company;

public abstract class Shape {
    private int numSides;

    public Shape() {
    }

    public Shape(int numSides) {
        this.numSides = numSides;
    }
    abstract void getArea();

    abstract void getPerimeter();

    public int getNumSides() {
        return numSides;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numSides=" + numSides +
                '}';
    }
}
