package ru.geekbrains.lesson2_5;

public class Metod1 {


    public static void mass1(int SIZE) {
        float[] mass1 = new float[SIZE];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (float)(mass1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.print("Metod 1 = ");
        System.out.println(System.currentTimeMillis()-a);
    }
}
