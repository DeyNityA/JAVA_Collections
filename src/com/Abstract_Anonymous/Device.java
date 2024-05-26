package com.Abstract_Anonymous;

public abstract class Device {
    String dev_name;
    public Device(String d_n){
        this.dev_name=d_n;
    }
    public abstract void code();
    public void show(){
        System.out.println("Device class");
    }
}
