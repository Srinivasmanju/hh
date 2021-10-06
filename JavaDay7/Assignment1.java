package com.company;

//adding 2 array lists
/*
list1=["shoes","socks","belt"]
list2=["a","c","d"]
result=[]

 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Assignment1  {
    public static void main (String[] args) {
        Assignment1 lis1 = new Assignment1();

        lis1.show();
    }
    public static void show() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        //    Collections.addAll(list, "a", "b", "c");
        list1.add("shoes");
        list1.add("socks");
        list1.add("belt");
        list2.add("a");
        list2.add("b");
        list2.add("c");
        System.out.println("List1 is " + list1);
        System.out.println("List2 is " + list2);
        System.out.println("Now Adding to two list");
        list1.addAll(list2); //[!,a,b]
        System.out.println(list1);
    }
}
