package com.company;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        float area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void getPerimeter() {
        float perimeter = 2 * (width + height);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }


}
