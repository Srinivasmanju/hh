//package com.company;
//Exceptions handling: ia a mechanism to handle runtime errors.
/* 1> checked Exception- the onces that every developer must anticipate
 and handle properly and also know as compile time Exception
2> Umchecked Exception(runtime Exception)- they are not checked at compile time,
they are checked at run time.
3> Error- an error extenal to ur application , it is irrecoverable.
Examples: OutOfMemoeyError, VirtualMachineError

runtime exceptions:
- nullPointer Exception
-Arithematic Exception
-Illegal Argument Exception
-IndexOutOfBound Exception
-IllegalStateException
 */
/*
public class Main {

    public static void main(String[] args) {
	// write your code here
        Exception.show();
    }
}
*/
package com.company;
import java.util.*;

public class Main {
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