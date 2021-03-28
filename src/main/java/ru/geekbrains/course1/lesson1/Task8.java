package ru.geekbrains.course1.lesson1;

public class Task8 {
    public static void main(String[] args) {
        int a = 21;
        int year = a;
        if (a % 400 == 0) {
            System.out.println("Год високосный");
        } else if (a % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (a % 4 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }

    }
}
