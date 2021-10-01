package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Exception {
    public static void show(){
        FileReader reader=null;
        try {
            reader = new FileReader("file.txt");
            System.out.println("file opened");
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println("Files does not exist");
        }
        catch (IOException e){
            System.out.println("cannot reach out the file");
        }
        finally {
          if(reader !=null)  {
              try {
                  reader.close();
              }
              catch (IOException e){
                  e.printStackTrace();
              }
            }
        }

    }
   // public static void sayHello(String name){
     //   System.out.println(name.toUpperCase());
    }

