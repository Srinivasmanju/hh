package com.company;

public class Demo {
    public static void main(String[] args) throws java.lang.Exception, ArrayIndexOutOfBoundsException{
        int[] arr=new int[5];
        //arr[5]->memory of size 5
        System.out.println("hello");
        System.out.println(arr[5]);
        add(2,4);

    }
    public static void add(int a, int b){
        int sum= a+b;
        System.out.println(sum);


    }
}
//throw

/* try{
      throw{
      }
      }
 */