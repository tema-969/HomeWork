package ru.geekbrains.course1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class MainAppShum {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        hiddenNumber();
        int variant;
        do {
            System.out.println("Повторить игру еще раз?");
            System.out.println("1 - ДА!!!");
            System.out.println("0 - Нет!!!");
           variant= sc.nextInt();
        }while (variant<0||variant>1);
        if (variant==1){
            hiddenNumber();
        }

    }

    public static void hiddenNumber() {

        System.out.println("Здравствуй Друг!");
        System.out.println("Твоя задача угадать загаданное число от 0 до 9 ");
        int x = rand.nextInt(10);
        int attempt = 3;
        System.out.println("Введите предполагаемое число: ");
        int a = sc.nextInt();
        attempt--;
        while (attempt >= 0) {
            if (attempt == 0) {
                System.out.println("Увы, попыток не осталось =(");
                break;
            }
            else if (a < x) {
                System.out.println("Введеное число меньше загаданного!");
                System.out.println("Попыток осталось " + attempt);
                a = sc.nextInt();
                attempt--;
            }
            else if (a > x) {
                System.out.println("Введеное число больше загаданного!");
                System.out.println("Попыток осталось " + attempt);
                a = sc.nextInt();
                attempt--;
            }
            else if (a == x) {
                System.out.println("Поздравляю!!! Вы угадали число!!!");
                break;
            }

        }
    }
}
