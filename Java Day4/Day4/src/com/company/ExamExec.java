package com.company;

public class ExamExec implements Example1,Atm{
    @Override
    public void draw_money() {
        System.out.println("money to be drawn");
    }
    public void withdraw(){
        System.out.println("draw money");
    }
    public void Dep_money(){
        System.out.println("draw money");
    }
}
