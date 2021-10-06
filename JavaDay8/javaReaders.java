package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.PermissionCollection;

public class javaReaders {
    public static void main(String args[]) throws IOException {
        Writer w= new FileWriter("C:\\Users\\user431\\Downloads\\test.txt");
   String s ="I love java";
        w.write(s);
        w.close();
        System.out.println("writing is Successful");
    }

}
