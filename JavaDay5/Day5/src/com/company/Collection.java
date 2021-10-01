package com.company;
/* collection
Frameworks-> more Class
Collection are used to handle large data set.
Collection some of the interfaces(list,set,queue)
Architecture


 */

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
int[] array= new int[5];
//dynamic
    //class ArrayList,Arrayset(),<list>Hashmap()....
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Srinivas");
        list1.add("manju");
        //list1.size();
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        Iterator it= list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            System.out.println();
        }

    }

}
