package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Scannersj {
    public static void main(String args[]) throws IOException{
        //Scanner s = new Scanner("enter Something");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Name is "+name);
        s.close();
    }
}
