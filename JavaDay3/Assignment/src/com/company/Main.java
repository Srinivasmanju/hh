package com.company ;

import com.company.ExtentCal;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cal cal= new Cal();
        ExtentCal cal1 = new ExtentCal();
        double num1=0.0;
        double num2=0.0;
        while(true){
            System.out.println("Calculator\n Select the options");
            System.out.println("1)Add\n2)Sub\n3)Mul\n4)Div\n5)oddorEven\n6)Prime\n7)Sqr\n8)Exit");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            switch(c){
                case 1: cal.add();
                    break;
                case 2: cal.sub();
                    break;
                case 3: cal.mul();
                    break;
                case 4: cal.div();
                    break;
                case 5: cal1.oddoreven();
                    break;
                case 6: cal1.prime();
                    break;
                case 7: cal1.sqr();
                    break;
                case 8:System.exit(0);
                default:System.out.println("Wrong input");
            }


        }

    }
}
