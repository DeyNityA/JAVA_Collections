package com.Abstract_Anonymous;

public class Desktop extends Device {
    public Desktop(String name){
        super(name);
    }
    @Override
    public void code(){
        System.out.println("Using Desktop");
    }
}
