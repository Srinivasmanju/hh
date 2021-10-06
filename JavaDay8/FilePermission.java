package com.company;

import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermission {
    public static void main(String args[]) throws IOException{
        String s="C:\\Users\\user431\\Downloads\\filepersmissiontest";
        java.io.FilePermission files1= new java.io.FilePermission("C:\\Users\\user431\\Downloads\\-","read");
        PermissionCollection permission =files1.newPermissionCollection();

    }
}
