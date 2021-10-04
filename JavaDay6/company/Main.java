package com.company;
//Generics
public class Main {
    private Object[] items = new Object[10];
    private int count;

    public void add(Object item) {
        items[count++] = item;
        System.out.println(item);
    }

    public Object get(int index) {
        return items[index];
    }


    public static void main(String[] args) {
	// write your code here
        var list= new Main();
        list.add(1);
        list.add("1");
        list.add(new User());
        int number = (int)list.get(1);
       // list.get(1);
    }
}
