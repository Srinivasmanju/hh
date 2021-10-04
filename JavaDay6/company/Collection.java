package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    //List,set,Queue
    //class arrayList,arrayset,Vector,map,hashmap
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<Integer>();
        Main list1= new Main();
        //Colletion are bascially work with objects
        //Primitive data types are not object
        //Wrapper class because data type to object
        //begin of collection->address
        list.add(23);
        list.add(25);
        list.add(26);
        list.add(27);
        // [23,25,26,27]
       // Stack- last in first out

        Iterator it= list.iterator();
        while (it.hasNext()){
            //it=-1
            //it=0
            //it=1
            System.out.println(it.next());
        }

    }
}
