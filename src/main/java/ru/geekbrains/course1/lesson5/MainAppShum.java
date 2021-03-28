package ru.geekbrains.course1.lesson5;

public class MainAppShum {
    public static void main(String[] args) {
        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Иванов",
                "Иван",
                "Инженер",
                "ivan@mail.ru",
                89257372255l,
                30000,
                37);
        persArray[1] = new Personal("Петров",
                "Михаил",
                "Администратор",
                "mikhail@mail.ru",
                89204925587l,
                25000,
                44);
        persArray[2] = new Personal("Сидоров",
                "Олег",
                "Разнорабочий",
                "oleg@mail.ru",
                89257775552l,
                80000,
                52);
        persArray[3] = new Personal("Зубров",
                "Евгений",
                "Директор",
                "zybr@mail.ru",
                89257356958l,
                140000,
                64);
        persArray[4] = new Personal("Новиков",
                "Илья",
                "Стажер",
                "novikov@mail.ru",
                89254563255l,
                25000,
                20);

        print(persArray);
    }

    public static void print(Personal[] persArray) {
        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge()>40){
                persArray[i].info();
            }
        }
    }
}
