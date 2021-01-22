package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class task2 {


    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int x = rand.nextInt(words.length);
        String word = words[x];

        shum(word);
    }

    public static void shum(String word) {


        while (true) {
            String result = new String();
            System.out.println("Введите загаданное слово ");
            String playerWord = sc.nextLine();
            while (playerWord.length() < 15) {
                playerWord = playerWord + '#';
            }
            while (word.length() < 15) {
                word = word + '#';
            }
            if (playerWord.equals(word)) {
                System.out.println("Вы угадали слово!!!");
                break;
            }
            for (int i = 0; i < playerWord.length(); i++) {
                if (playerWord.charAt(i) == word.charAt(i)) {
                    result = result + word.charAt(i);

                } else {
                    result = result + '#';
                }

            }

            System.out.println(result);

        }
    }
}
