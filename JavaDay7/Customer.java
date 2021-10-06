package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;
    public static void main(String[] args){
        List<Customer> customers= new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers);
        System.out.println(customers);

    }
    public Customer(String name){
        this.name= name;
    }

    @Override
    public int compareTo(Customer other) {
       return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
