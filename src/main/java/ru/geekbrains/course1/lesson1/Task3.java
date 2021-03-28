package ru.geekbrains.course1.lesson1;

public class Task3 {
    public static void main(String[] args) {
//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println(equation(3.12f,7.654f, 12.84f,2.212f));
    }

    public static float equation(float a, float b, float c, float d){
        float result = a*(b+(c/d));
        return result;
    }
}
