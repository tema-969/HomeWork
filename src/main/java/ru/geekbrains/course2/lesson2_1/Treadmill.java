package ru.geekbrains.course2.lesson2_1;

public class Treadmill implements Let {
    private int longTreadMill;

    public int getLongTreadMill() {
        return longTreadMill;
    }

    public Treadmill(int longTreadMill) {
        this.longTreadMill = longTreadMill;
    }
}
