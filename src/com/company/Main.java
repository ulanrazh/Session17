package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,5,4);
        Shape triangle = new Triangle(3,3,5);
        rectangle.getArea();
        rectangle.getPerimeter();

        triangle.getArea();
        triangle.getPerimeter();
    }
}
