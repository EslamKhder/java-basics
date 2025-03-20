package main.patterns;

public class StudentService implements SchoolService{

    @Override
    public void save() {
        System.out.println("save StudentService");
    }

    @Override
    public void update() {
        System.out.println("update StudentService");
    }

    @Override
    public void delete() {
        System.out.println("delete StudentService");
    }
}
