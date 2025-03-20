package main.school;

public class Person implements StudentService {

    @Override
    public void print1() {
        System.out.println("print1");
    }


    @Override
    public void print3() {
        System.out.println("Override print2");
    }

    public static void show() {

    }
}
