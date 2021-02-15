package ru.geekbrains.lesson8;

public class Plate {
    private int food;
    private int capacity;

    public int getFood() {
        return food;
    }

    public Plate(int capacity) {
        this.capacity = capacity;

    }

    public void fillMax() {
        food = capacity;
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n ", food, capacity);
    }

    public boolean leftoverFood(int appetite) {
        if (food >= appetite) {
            return true;
        }
        return false;
    }

    public void decreaseFood(int amount) {
        if (leftoverFood(amount)) {
            food -= amount;
        }
    }
}
