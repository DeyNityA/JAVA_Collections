package com.polymorphism;

public class Square extends Shapes{
    private int a;
    public Square(int a){
        super();
        this.a=a;
        System.out.println("square constructor");
    }
    @Override
    public void Area(){
        System.out.println("Area of Square is :"+a*a);
    }
}
