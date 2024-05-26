package com.Abstract_Anonymous;

public class Developer {
    private Device d;
    public Developer(Device d){
        this.d=d;
    }
    public void using_device(){
        this.d.code();
        System.out.println(this.d.hashCode()+" "+d.dev_name);
    }
}
