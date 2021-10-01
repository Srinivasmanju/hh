
package com.company;
import java.util.*;

public class Assignment {
    public static void main(String args[]) {
        int count = 0;
        int n = 0;

        int array[] ={1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array");

        try {
            for (int i = 0; i <= array.length; i++) {
                for (int j = i; j < array.length-1; j++) {
                    System.out.println("[" + array[i] + "," + array[j + 1] + "]");
                    count++;
                }
                System.out.println("\n");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array out of Bound");
        }
        System.out.println("count is" + count);

    }

}