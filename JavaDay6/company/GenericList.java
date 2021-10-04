package com.company;

public class GenericList<T> {
    private T[] items=(T[]) new Object[10];
    private int count;
    public void add(T item) {
        items[count++] = item;
        System.out.println(item);
    }
    public T get(int index) {

        return items[index];

    }

    public static void main(String[] args) {
        new GenericList<Integer>().add(1);
        new GenericList<Float>().add(4.8f);
        new GenericList<Float>().add(4.8f);
        new GenericList<String>().add("hello");
        new GenericList<Integer>().get(0);
        new GenericList<Float>().get(0);
        new GenericList<String>().get(3);
        GenericList<Integer> numbers= new GenericList<>();
        numbers.add(1);   //Boxing
        int number = numbers.get(0); //
        GenericList<String> names= new GenericList<>();
        names.add("hello");   //Boxing
        String name = names.get(0);
        names.add("Srini");   //Boxing
        name = names.get(1);
        names.add("Ravi");   //Boxing
        name = names.get(2);

    }

}
