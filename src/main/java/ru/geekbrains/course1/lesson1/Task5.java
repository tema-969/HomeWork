package ru.geekbrains.course1.lesson1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(number(0));
    }

    public static int number(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return a;
    }
}

