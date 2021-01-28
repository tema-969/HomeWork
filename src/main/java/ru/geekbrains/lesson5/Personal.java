package ru.geekbrains.lesson5;

public class Personal {
    private String surname;
    private String name;
    private String position;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    public String getSurname(){
        return  surname;
    }
    public String getName(){
        return  name;
    }
    public String getPosition(){
        return  position;
    }
    public String getEmail(){
        return  email;
    }
    public long getTelephone(){
        return  telephone;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    public Personal(String surname, String name, String position, String email, long telephone, int salary, int age) {

        this.surname = surname;
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %s %s %s %d %d %d\n", surname, name, position, email, telephone, salary, age );
    }

}
