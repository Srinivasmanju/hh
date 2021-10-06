package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//FileInputStream- used to reading byte - oriented data(eg: image,audio, Video)
public class FileInputStreaams {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\user431\\Downloads\\read.txt");
            int i = 0;
            while ((i= fin.read())!=-1){
                System.out.print((char) i);

            }
            fin.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }}
