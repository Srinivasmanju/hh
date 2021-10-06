package com.company;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

//Java I/O
/*
Java I/o: Contains all the class required for input and output operations.
- File Handling
--Stream--

1> System.out- Standard output Stream
2> System.in- Standard input Stream
3> System.err- Standard error Stream

outst

//public void write(int) throws IOException-> it is used to write a byte to current output stream.
//public void write(byte[]) throws IOException-> it is used to write an array of byte to...
//public void flush() throws IOexception- flushes the output stream
public void close() throws IOExceptions

 */
//Fileoutputstream - if we want to write primitive values
public class Main {

    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\user431\\Downloads\\abc.txt");
            String s="Welcome to Torry Harris";
            byte a[]= s.getBytes();
            fout.write(a);
           // fout.write(66);
            fout.close();;
            System.out.println("Files Succesfully done");
        } catch (Exception e){
            System.out.println(e);
        }
	// write your code here
    }
}
