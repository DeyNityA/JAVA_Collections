package com.Inherit;

public class Box{
    private int l;
    private int b;
    private int h;
    public Box(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public int getVolume(){
        return l*b*h;
    }
}
