package com.company;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class BufferOutputStream {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\user431\\Downloads\\test.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s= "Welcome to torry Harris, my name is Srinivas";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("file overloading");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}