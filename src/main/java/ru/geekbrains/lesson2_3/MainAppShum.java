package ru.geekbrains.lesson2_3;

import java.util.List;

public class MainAppShum {
    public static void main(String[] args) {
        ArList.arList();
        FoneBook book = new FoneBook();
        book.add("89456325885", "Petrov");
        book.add("89525425385", "Ivanof");
        book.add("89256868785", "Dubrov");
        book.add("89458596495", "Petrov");
        book.add("89456358778", "Sidorov");
        book.add("89556631485", "Prostov");
        book.add("89458415585", "Kritov");
        book.add("89515318885", "Nafin");
        book.add("89456323699", "Titov");
        book.add("89459846455", "Sidorov");
        book.add("89499999999", "Petrov");

        List<String> surname = book.get("Petro");
    }

}
