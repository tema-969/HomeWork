package ru.geekbrains.course1.lesson8;

public class MainAppShum {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Murzik", 20);
        cats[2] = new Cat("Pushok", 20);
        cats[3] = new Cat("Nafik", 5);
        plate.info();
        plate.fillMax();
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }

}
