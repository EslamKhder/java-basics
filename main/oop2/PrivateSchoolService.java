package main.oop2;

/*  extend      between     same type    (class)     (interface)     class interface         interface class*/
/* implements      class     interface */

public class PrivateSchoolService implements StudentService {

    /* 100 */
    @Override
    public void printStudent() {
        System.out.println("PrivateSchoolService");
    }

    public void show() {
        System.out.println("PrivateSchoolService show");
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public void printTeacher() {

    }
}
