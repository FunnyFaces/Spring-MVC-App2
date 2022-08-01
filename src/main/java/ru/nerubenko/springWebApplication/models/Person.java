package ru.nerubenko.springWebApplication.models;

public class Person {
    private int id;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
