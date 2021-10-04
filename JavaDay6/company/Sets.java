package com.company;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Sets {
    public static void main(String[] args){
        Set<Integer>set= new CopyOnWriteArraySet<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<Integer> que= new ArrayDeque<Integer>();

        list.add(24);
        list.set(0,24);
        que.add(24);
        que.add(26);
        que.poll();
        que.remove();
        //
    }
}
