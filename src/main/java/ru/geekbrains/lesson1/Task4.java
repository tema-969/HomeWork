package ru.geekbrains.lesson1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(SuitableNumber(20,14));
    }
    public static boolean SuitableNumber(int a, int b){
        if (a + b >=10 && a + b<=20){
            return true;
        }
        return false;
    }
}
