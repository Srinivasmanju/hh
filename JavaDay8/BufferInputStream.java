package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\user431\\Downloads\\test.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i=bin.read())!=-1) {

                System.out.print((char) i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
