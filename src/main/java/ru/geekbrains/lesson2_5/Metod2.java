package ru.geekbrains.lesson2_5;

import static ru.geekbrains.lesson2_5.MainAppShum.HALF;

public class Metod2 {

    public static void mass2(int SIZE) {
        float[] mass2 = new float[SIZE];
        float[] massA = new float[HALF];
        float[] massB = new float[HALF];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(mass2,0,massA,0,HALF);
        System.arraycopy(mass2,HALF,massB,0,HALF);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < massA.length; i++) {
                massA[i]=(float)(massA[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < massB.length; i++) {
                massB[i]=(float)(massB[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();

        System.arraycopy(massA,0,mass2,0,HALF);
        System.arraycopy(massB,0,mass2,HALF,HALF);

        System.currentTimeMillis();
        System.out.print("Metod 2 = ");
        System.out.println(System.currentTimeMillis()-a);
    }
}
