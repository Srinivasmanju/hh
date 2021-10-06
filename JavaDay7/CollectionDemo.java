package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection= new ArrayList<>();
        collection.add("x");
        collection.add("y");
        collection.add("z");
        for (var item: collection)
            System.out.println(item);
    }

}

