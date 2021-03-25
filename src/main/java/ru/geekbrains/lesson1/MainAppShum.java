package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainAppShum {
    public static void main(String[] args) {
        //проверял рабочий ли код.
//        String[] massStr = {"a", "B", "c", "apple", "banana", "apricote"};
//        List<String> alStr = new ArrayList<>();
//        transform(massStr, alStr);
//        System.out.println(alStr);
//        exchange(alStr, 3, 0);
//        System.out.println(alStr);
//
//
//
//
//        Box box1 = new Box();
//        Box box2 = new Box();
//        Box box3 = new Box();
//        Apple apple = new Apple();
//        Orange orange = new Orange();
//        box1.add(apple);
//        box1.add(apple);
//        box1.add(apple);
//        box1.add(apple);
//        box2.add(orange);
//        box2.add(orange);
//        box3.add(apple);
//        System.out.println(box1.getWeigt(box1.getFruits()));
//        System.out.println(box1.compare(box2));
//        box1.shift(box3);



    }

    public static <T> void exchange(List<T> mass, int element1, int element2) {
        if (element1 <= mass.size() && element2 <= mass.size() && element1 != element2) {
            T box1 = mass.get(element1);
            T box2 = mass.get(element2);
            mass.set(element1, box2);
            mass.set(element2, box1);
        }
    }

    public static <T> void transform(T[] mass, List<T> arlist) {
        Collections.addAll(arlist, mass);

    }

}
