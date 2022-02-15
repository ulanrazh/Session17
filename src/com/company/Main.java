package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,4);
        Shape triangle = new Triangle(3,5);

        System.out.println(rectangle);
        rectangle.getArea();
        rectangle.getPerimeter();

        System.out.println(triangle);
        triangle.getArea();
        triangle.getPerimeter();
    }
}
