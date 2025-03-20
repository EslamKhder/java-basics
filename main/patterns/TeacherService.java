package main.patterns;

public class TeacherService implements SchoolService{

    @Override
    public void save() {
        System.out.println("save TeacherService");
    }

    @Override
    public void update() {
        System.out.println("update TeacherService");
    }

    @Override
    public void delete() {
        System.out.println("delete TeacherService");
    }
}