package com.polymorphism;

public class Circle extends Shapes{
    private  int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
        System.out.println("circle constructor");
    }

    @Override
    public void Area() {
        //super.Area();------
        System.out.println("Area of Circle is :"+3.14*radius*radius);
    }
}
