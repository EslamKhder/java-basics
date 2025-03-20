package main.school;

public interface StudentService {

    int num = 5;

    void print1();

    static void print2() {
        System.out.println("static print2");
    }

    default void print3() {
        System.out.println("default print3");
    }

}
