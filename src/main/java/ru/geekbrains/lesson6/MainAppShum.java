package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.Animals.Cat;
import ru.geekbrains.lesson6.Animals.Dog;

public class MainAppShum {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        cat.run(200);
        cat.swim(100);
        Dog dog = new Dog("Бобик");
        dog.run(500);
        dog.swim(20);
        }
    }

