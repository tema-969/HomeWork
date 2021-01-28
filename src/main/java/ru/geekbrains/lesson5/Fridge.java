package ru.geekbrains.lesson5;

public class Fridge {
    private String model;
    private String color;
    private String powerUsage;


    boolean enabled;
    boolean doorOpened;

    float normalTemperature;
    float temperature;

    public Fridge() {

    }

    public void switchOn() {
        enabled = true;
    }

    public void switchOff() {
        enabled = false;
    }

    public void doorOpen() {
        temperature=normalTemperature+3;
        if (doorOpened) {
            System.out.println("Дверь холодильника уже открыта.");
        } else {
            doorOpened = true;
            System.out.println("Мы открыли дверь");
        }
        System.out.println("Температура в холодильнике - " + temperature);
    }

    public void doorClose() {
        temperature=normalTemperature;
        if (doorOpened) {
            System.out.println("Мы закрыли дверь холодильника.");
            doorOpened = false;
        } else {
            System.out.println("Дверь холодильника закрыта");
        }
        System.out.println("Температура в холодильнике - " + temperature);
    }

    public void cold(){
        if(enabled&&doorOpened){
            temperature=temperature+3;
        }
    }

}
