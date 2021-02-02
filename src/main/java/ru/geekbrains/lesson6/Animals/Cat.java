package ru.geekbrains.lesson6.Animals;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int longRun) {
        if (longRun>=0 && longRun <= 200) {
            super.run(longRun);
        }else if(longRun<0){
            System.out.println("Нельзя бежать в минус =)");
        } else {
            System.out.println("Кот не может пробежать более 200 м.");
        }
    }
    @Override
    public void swim (int longSwim){
        System.out.println("Кот не умеет плавать!!!");
    }
}
