package ru.geekbrains.lesson2_1;

public class MainAppShum {
    public static void main(String[] args) {
        Champion[]champions = new Champion[3];
        champions[0] = new Cat("Barsik",4,200);
        champions[1] = new People("Ivan",1,400);
        champions[2] = new Robot("Robotron",10,500);
        Let[] let = new Let[2];
        let[0] = new Wall(4);
        let[1] = new Treadmill(250);

        for (int i = 0; i < let.length; i++) {
            for (int j = 0; j < champions.length; j++) {
               // champions[j].run();//yне понимаю как заставить это заработать...
            }
        }
    }
}
