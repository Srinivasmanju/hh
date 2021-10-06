package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var list= new GenericList<String>();
        var iterator= list.iterator();
        //[a,b,c]
        //
        list.add("x");
        list.add("y");
        for (var item : list)
            System.out.println(item);
        /*
        while(iterator.hasNext()){
            var current=iterator.next();
            System.out.println(current);
        }

         */
    }
}
