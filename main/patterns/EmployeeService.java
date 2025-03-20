package main.patterns;

public class EmployeeService implements SchoolService{

    @Override
    public void save() {
        System.out.println("save EmployeeService");
    }

    @Override
    public void update() {
        System.out.println("update EmployeeService");
    }

    @Override
    public void delete() {
        System.out.println("delete EmployeeService");
    }
}