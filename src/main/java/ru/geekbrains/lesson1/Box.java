package ru.geekbrains.lesson1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Box<T> extends Fruit {
    private List<T> fruits;
    private int counter;

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }

    public Box(T... items) {
        this.fruits = new ArrayList<>(Arrays.asList(items));
        counter = 0;
    }


    public void add(Fruit fruit) {
        if (fruits.isEmpty() || fruit.equals(fruits.get(0))) {
            fruits.add((T) fruit);
            counter++;
        }
    }

    public float getWeigt(List<Fruit> fruitList) {
        float res = 0.0F;
        if (!fruits.isEmpty()) {
            res = counter * fruitList.get(0).getWeight();
        }
        return res;
    }


    public boolean compare (Box another){
        return Math.abs(this.getWeigt((List<Fruit>) this.getFruits()) - another.getWeigt(another.getFruits()))<0.0001;
    }

    public void shift(Box another){
        if ((another.fruits.isEmpty()) || this.fruits.get(0).equals(another.fruits.get(0)) ){
            for (int i = 0; i < this.fruits.size(); i++) {
                another.add((Fruit) fruits.get(i));
            }
            this.fruits.clear();
            this.counter = 0;
        }
    }

}
