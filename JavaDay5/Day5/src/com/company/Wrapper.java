package com.company;
/*Wrapper Class- are the class but predefined class.the mechanism to convert
 primitive into object and object into primitive.
autoboxing and unboxing feature convert primitives into objects and objects into primitives
automatically. The automatic conversion of primitive into an object is known as autoboxing
and vice-versa unboxing.
Primitive data types are default datatypes like int,float,double.
Non Primitive data types are user defined
1>wrapper Class: will be Integer, Float, Double,Short, Long.
it contain  primitive data types inside that
 */
public class Wrapper {
    public static void main(String[] args){
        String prize1="10000";
        String prize2="5000";
        int prizel1= Integer.valueOf(prize1)+ Integer.valueOf(prize2);
        System.out.println(prizel1);
        int variable= 100;
        System.out.println("Primitive int "+variable);
        Integer variable2=100;
        System.out.println("wrapper variable "+variable2);
        /* Uses
        collection wraps, Object create
         */


    }
}
