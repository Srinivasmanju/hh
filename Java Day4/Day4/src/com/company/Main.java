package com.company;

import java.util.Scanner;

/*
    abstract class Car {
        abstract void start();
    }

    class Swift extends Car {
        void start() {
            System.out.println("Car Started");
        }
    }


    public class Main {
        public static void main(String[] args) {
            // write your code here
            Car obj = new Swift();
            obj.start();
        }
    }

*/
/*
abstract class Car {
    abstract void start();
    abstract void stop();
    abstract void break1();
    abstract void speed();

    public void basicinfo(){
        System.out.println("4 wheels");
    }

}


class BMW extends Car{
    @Override
    void start() {
        System.out.println("BMW car Starts");
    }

    @Override
    void stop() {
        System.out.println("BMW car stops");

    }

    @Override
    void break1() {
        System.out.println("BMW car is on break");

    }

    @Override
    void speed() {
        System.out.println("BMW car speed is");

    }
    void model(){
        System.out.println("BMW model X10");
    }
    void windshield(){
        System.out.println("BMW windshield");
    }
}
class Swift extends Car {
    @Override
    void start() {
        System.out.println(" Swift car Starts");
    }

    @Override
    void stop() {
        System.out.println("Swift car stops");

    }

    @Override
    void break1() {
        System.out.println(" Swift car is on break");

    }

    @Override
    void speed() {
        System.out.println("Swift car speed is 200");

    }
    void design() {
        System.out.println("Swift Design");
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here
        Car obj = new BMW();
        Car obj1= new Swift();
        Swift sw1= new Swift();
        BMW BW1 = new BMW();
        obj.start();
        obj.stop();
        obj.break1();
        obj.speed();
        sw1.design();
        obj1.start();
        obj1.stop();
        obj1.break1();
        obj1.speed();
        BW1.model();
        BW1.windshield();
    }
}

 */
public abstract class Abstract {
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
    Scanner sc= new Scanner(System.in);
    public void input(){
        int[] array= new int[100];
        System.out.println("enter the values");


    }
}


    public void basicinfo(){
        System.out.println("4 wheels");
    }