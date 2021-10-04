package com.company;

import java.util.*;

public class Maps {
    public static void main(String[] args){
        Map<String,Integer> map= new HashMap<String, Integer>();
        ArrayList<String> list= new ArrayList<String>();
        Map<String,ArrayList> maplist= new HashMap<String,ArrayList>();
        //java is based on Object
        //nested map
        //[1,2,3,4,5,6,7]
        //{"name":"hemanth","name1":"hemath" ( key must be unique)
        //map.get("name")
        //hemanth
        //pair of key and value
        //key must be not similar
        map.put("number1",12345);
        map.put("number2",12335);
        map.get("number1");
        map.remove("number1");
       // foreach(int j:array)
        /*
        sout(j);

         */
        for (String key:map.keySet()) {
            System.out.println(key);
            map.get(key);
        }

            for (Integer value:map.values()) {
                System.out.println(value);
            }
        System.out.println("on iterator");
            Iterator it =map.keySet().iterator();
            while (it.hasNext()){
                String key=(String) it.next();
                System.out.println(key);
                System.out.println(map.get(key));
            }
            //college branch, cs=> Student name, EC=> Student name
               //usn=>{name:umesh,age:,college:}
        //String=>map
                list.add("cs");
                list.add("ec");
                list.add("ise");
        Scanner sc = new Scanner(System.in);
                for(int i=0;i<3;i++){
                    ArrayList<String> student_name= new ArrayList<>();
                      for(int j=0;j<3;j++){
                          System.out.println("enter "+list.get(i)+" student");
                          student_name.add(sc.next());
                      }
                    maplist.put(list.get(i),student_name);
            }
    }
}
