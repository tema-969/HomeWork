package ru.geekbrains.lesson6.Animals;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int longRun) {
        if (longRun>=0 && longRun <= 500) {
            super.run(longRun);
        }else if(longRun<0){
            System.out.println("Нельзя бежать в минус =)");
        }
        else {
            System.out.println("Пес не может пробежать более 500 м.");
        }
    }
    @Override
    public void swim(int longSwim){
        if(longSwim <=10){
            super.swim(longSwim);
        }else {
            System.out.println("Пес не может проплыть более 10 м.");
        }
    }
}
