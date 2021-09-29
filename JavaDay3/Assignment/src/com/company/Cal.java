package com.company;
import java.util.Scanner;
import java.util.*;

import org.w3c.dom.ls.LSOutput;

public class Cal {
    double num1=0.0;
    double num2=0.0;
    double sum=0.0;
    Scanner scan = new Scanner(System.in);


    public double add (){
        System.out.println("enter the two number");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        sum= num1+num2;
        System.out.println(sum);
        return sum;
    }
    public double sub (){
        System.out.println("enter the two number");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        sum= num1-num2;
        System.out.println(sum);
        return sum;
    }
    public double mul(){
        System.out.println("enter the two number");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        sum= num1*num2;
        System.out.println(sum);
        return sum;
    }
    public double div (){
        System.out.println("enter the two number");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        sum= num1/num2;
        System.out.println(sum);
        return sum;
    }
}
