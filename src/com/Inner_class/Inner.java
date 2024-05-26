package com.Inner_class;

public class Inner {
    protected int a;
    protected int b;

    public Inner(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(){
        System.out.println(this.a+this.b);
    }

    public static class B{
        public void sum2(){
            System.out.println("Inner1 class");
        }
    }

    public class C{
        public void sum3(){
            System.out.println("Inner2 class");
            System.out.println(a+b);
        }
    }

}
