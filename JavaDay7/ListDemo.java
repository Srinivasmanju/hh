package com.company;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main (String[] args) {
        ListDemo lis = new ListDemo();
        lis.show();
    }
        public static void show() {
            List<String> list = new ArrayList<>();
        //    Collections.addAll(list, "a", "b", "c");
            list.add("a");
            list.add("b");
            list.add("c");
            System.out.println(list);
            System.out.println("Now Adding to list");
            list.add(0, "!"); //[!,a,b]
            System.out.println(list);
            list.get(0);
            System.out.println("now set to list");
            list.set(0, "x");//[z,b]
            System.out.println(list);
            System.out.println("removes the first index");
            list.remove(0);
            System.out.println(list);
            System.out.println(list.indexOf("l")); // if not present in list then returns -1
            System.out.println(list.indexOf("a"));
            list.add("a");
            System.out.println("Last index of a "+list.lastIndexOf("a"));
            System.out.println("SubList are "+list.subList(0,2));
    }


}
//adding 2 array lists
/*
list1=["shoes","socks","belt"]
list2=["a","c","d"]
result=[]

 */