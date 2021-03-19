package ru.geekbrains.lesson2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoneBook {

     static HashMap<String, String> fB = new HashMap<>();


    public void add(String fonenumber, String familiya){
        fB.put(fonenumber,familiya);
    }
    public List <String> get(String familiya){
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> o : fB.entrySet()) {
            if(familiya.equals(o.getValue())){
                result.add(o.getKey());
            }
        }
        System.out.println(familiya + " : " + result);
        return result;
    }

}
