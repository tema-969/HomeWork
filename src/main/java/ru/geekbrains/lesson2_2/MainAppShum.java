package ru.geekbrains.lesson2_2;

public class MainAppShum {

    public static void main(String[] args) {


        String[][] mass = {{"1", "12", "4", "6"}, {"2", "I", "4", "6"}, {"1", "12", "4", "6"}, {"2", "1", "4", "6"}};
        try {
            massive(mass);
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }


    }

    public static void massive(String[][] mass)throws MyArrayDataException,MyArraySizeException {

        if (mass.length != 4) {
            throw new MyArraySizeException("Длина массива не равна 4");
        }
        int sum = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < mass.length; i++) {
                for (j = 0; j < mass.length; j++) {
                    int a = Integer.parseInt(mass[i][j]);
                    sum = sum + a;

                }
            }
            System.out.println("Сумма чисел = " + sum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j, mass[i][j]);
        }


    }

}
