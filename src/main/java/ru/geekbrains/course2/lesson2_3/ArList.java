package ru.geekbrains.course2.lesson2_3;

import java.util.*;

public class ArList {

    public static void arList() {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("potato");
        al.add("pear");
        al.add("apricot");
        al.add("pineapple");
        al.add("pear");
        al.add("robot");
        al.add("human");
        al.add("cat");
        al.add("rabbit");
        al.add("robot");
        al.add("pear");
        al.add("cat");
        al.add("dog");
        al.add("pear");
        al.add("cat");
        al.add("dog");

        HashSet<String> set = new HashSet<>(al);
        System.out.println(set);
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
            map.put(al.get(i), Collections.frequency(al, al.get(i)));
           // System.out.println("Слово "+al.get(i) + " повторяется "+Collections.frequency(al, al.get(i)) + " раз.");

        }
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}