package com.company;
import java.util.*;
import java.util.ArrayList;
//Student info
//map
//usn->Student(name,id,college,branch,year,age,place)
//Map<String,Map> students
//create map inside for loop map<String, String> studentinfo
//name,age,year,college,place,branch
//map Studentinfo= student.get("usn")
//studentinfo.ger("name");

public class Assignment {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        Map<String,Map> maplist = new HashMap<>();
        list.add("1dv123");
        list.add("1sv143");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            ArrayList<String> student_name = new ArrayList<>();
            ArrayList<String> student_age = new ArrayList<>();
            ArrayList<String> student_year = new ArrayList<>();
            ArrayList<String> student_college = new ArrayList<>();
            ArrayList<String> student_usn = new ArrayList<>();

            for (int j = 0; j < 1; j++) {
                Map<String,String> nameMap = new HashMap<>();


                System.out.println("enter " + list.get(i) + " student name");
                student_name.add(sc.next());
                nameMap.put(list.get(j),student_name);
                System.out.println("enter " + list.get(i) + " student age");
                student_age.add(sc.next());
                System.out.println("enter " + list.get(i) + " student year");
                student_year.add(sc.next());
                System.out.println("enter " + list.get(i) + " student college");
                student_college.add(sc.next());
                System.out.println("enter " + list.get(i) + " student usn");
                student_usn.add(sc.next());
            }
            System.out.println("enter the usn to be searched");
            Scanner so = new Scanner(System.in);
            String usn = so.next();
             if (usn.equals(student_usn)) {

                 maplist.put("Srini",student_usn);
             }

        }
    }

}
