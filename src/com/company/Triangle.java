package com.company;

public class Triangle extends Shape{
    private float width;
    private float height;

    public Triangle(int numSides) {
        super(numSides);
    }

    public Triangle(int numSides, float width, float height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        float area = width * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    void getPerimeter() {
        float perimeter = (width + height);
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

}
