package ru.geekbrains.course1.lesson2;

import java.util.Arrays;

public class MainAppShum {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1() {
        System.out.println("Task 1");


        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == 1) {
                    mass[i] = 0;
                } else {
                    mass[i] = 1;
                }
            }

            {
                System.out.println(Arrays.toString(mass));
            }
        }
    }

    public static void Task2() {
        System.out.println();
        System.out.println("Task 2");
        int[] mass = new int[8];
        {
            for (int i = 1; i < mass.length; i++) {
                mass[i] = mass[i - 1] + 3;
            }
        }
        {
            System.out.println(Arrays.toString(mass));
        }
    }

    public static void Task3() {
        System.out.println();
        System.out.println("Task 3");
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6) {
                    mass[i] = mass[i] * 2;
                }
            }
            System.out.println(Arrays.toString(mass));
        }

    }

    public static void Task4() {
        System.out.println();
        System.out.println("Task 4");
        int[][] mass2d = new int[5][5];

        for (int i = 0; i < mass2d.length; i++) {
            for (int j = 0; j < mass2d[i].length; j++) {
                if (i == j) {
                    mass2d[i][j] = 1;
                }
                if (i + j == mass2d[i].length-1) {
                    mass2d[i][j] = 1;
                }
                System.out.print(mass2d[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void Task5() {
        System.out.println();
        System.out.println("Task 5");
        int[] mass = {2, 6, 3, 6, 8, 1, -12, 22, 0, 15, -30, 28, 44};
        int max = mass[0];
        int min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }

        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

}