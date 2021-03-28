package ru.geekbrains.course1.lesson8;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate pl) {
        if (pl.leftoverFood(appetite)) {
            pl.decreaseFood(appetite);
            hungry = false;
        } else {
            hungry = true;
        }
    }

    public String catHungry(boolean hungry) {
        if (hungry) {
            return "голоден!";
        } else {
            return " сыт!";
        }
    }

    public void info() {
        System.out.println(name + " " + catHungry(hungry));
    }

}
