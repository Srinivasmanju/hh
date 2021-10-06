package com.company;



import java.util.HashMap;
import java.util.Scanner;

public class RedBus implements UserInterface {
    HashMap<String, HashMap> user = new HashMap<String, HashMap>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void option() {
        while (true) {
            System.out.println("add:1, remove:2, details:3, exit:4");
            System.out.println("Enter option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    book();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    details();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter the option properly");
            }
        }
    }

    public void book(){
        System.out.println("Enter the id of the user");
        String id = sc.next();
        HashMap<String,String> userInfo = new HashMap<String,String>();
        System.out.println("Enter the User name");
        userInfo.put("name",sc.next());
        System.out.println("Enter the starting point");
        userInfo.put("from",sc.next());
        System.out.println("Enter the destination ");
        userInfo.put("to",sc.next());
        user.put(id,userInfo);
    }

    @Override
    public void details() {
        System.out.println("Enter the id");
        String id = sc.next();
//        user.get(id);
        if (user.containsKey(id)) {
            HashMap userInfo = user.get(id);
            if (!userInfo.isEmpty()) {
                System.out.println("name = " + userInfo.get("name"));
                System.out.println("From = " + userInfo.get("from"));
                System.out.println("To = " + userInfo.get("to"));
            }
        } else
            System.out.println("Enter proper id");
    }
    public void remove(){
        System.out.println("Enter the id");
        String id = sc.next();
        user.remove(id);
    }

    public static void main(String[] args) {
        RedBus obj = new RedBus();
        obj.option();
    }



}