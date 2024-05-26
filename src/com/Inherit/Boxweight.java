package com.Inherit;

//java doesn't support multiple inheritance , because if two or more parents has same properties or variable
// child class will confuse which to pick, it will be done by interfaces
public class Boxweight extends Box{
    private int weight;

    public Boxweight(){
        super(1, 1, 1);
        this.weight=-1;
    }
    public Boxweight(int l, int b, int h, int weight){
        super(l, b, h); //call the parent type constructor, and it should write first
        //we can access l, b, h by writing either this.a, this.b, this.c or super.a, super.b, super.c; but
        // super is more safe as parent and child classes both can have have same variable or method name
        this.weight=weight;
    }

    public void showWeight(){
        System.out.println(this.weight);
    }

}