package ru.geekbrains.lesson2_1;

public class Robot implements Champion {
    private String name;
    private int heightJump;
    private int lengthRun;

    public int getLengthRun() {
        return lengthRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public Robot(String name, int heightJump, int lengthRun) {
        this.name = name;
        this.heightJump = heightJump;
        this.lengthRun = lengthRun;
    }

    @Override
    public void jump(int height) {
        if (height > 0 && height <= getHeightJump()) {
            System.out.println(name + " перепрыгнул препятствие высотой " + height + " м.");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие!");
        }
    }
    @Override
    public void run(int longdistance) {
        if (longdistance > 0 && longdistance <= getLengthRun()) {
            System.out.println(name + " пробежал препятствие длинной " + longdistance + " м.");
        } else {
            System.out.println(name + " не смог пробежать препятствие!");
        }
    }
}
