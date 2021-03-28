package ru.geekbrains.course1.lesson6.Animals;

public class Animals {
    String name;


    public void run(int longRun) {
        System.out.println(name + " пробежал " + longRun + " м.");
    }

    public void swim(int longSwim) {
        System.out.println(name + " проплыл " + longSwim + " м.");
    }
}
