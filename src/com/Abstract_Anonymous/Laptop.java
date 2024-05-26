package com.Abstract_Anonymous;

public class Laptop extends Device{
    public Laptop(String name){
        super(name);
    }
    @Override
    public void code(){
        System.out.println("using Laptop");
    }
}
