package main.streams;

public class Person {

    private int id;
    private String name;
    private double JPA;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.JPA = 0;
    }

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

    public double getJPA() {
        return JPA;
    }

    public void setJPA(double JPA) {
        this.JPA = JPA;
    }

    @Override
    public String toString() {
        return "{ID " + id + "Name " + name + "JPA " + JPA + "}";
    }
}
