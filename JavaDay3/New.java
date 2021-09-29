package com.company;

public class New extends cat{
    String name;
    String sid;
    public New(){
        name= "Srinivas";
        sid= "101";

    }
    public void display(){
        System.out.println("Dell");
        super.display("sriniva","109");
        this.name=name;
        this.sid=sid;
    }
}
