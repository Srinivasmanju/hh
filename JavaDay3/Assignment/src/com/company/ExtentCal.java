package com.company;
import static  java.lang.Math.*;
import java.util.Scanner;

public class ExtentCal extends Cal{
    double num1=0.0;
    double num2=0.0;
    double sum=0.0;
    Scanner scan = new Scanner(System.in);


    public double oddoreven() {
        System.out.println("enter the a number");
        num1 = scan.nextDouble();
        if (num1 % 2 == 0) {
            System.out.println("Entered number is even"); }

        else {
            System.out.println("Entered number is odd");
            return sum;
        }
        return sum;
    }
    public double prime () {
        System.out.println("enter a number number");
        num1 = scan.nextDouble();
        boolean flag = false;
        for (int i = 2; i <= num1 / 2; ++i) {
            // condition for nonprime number
            if (num1 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num1 + " is a prime number.");
        else
            System.out.println(num1 + " is not a prime number.");

        return sum;
    }
    public double sqr(){
        System.out.println("enter a  number");
        num1 = scan.nextDouble();


        System.out.println(sqrt(num1));
        return sum;
    }
}
