package main.patterns;

public class main {
    public static void main(String[] args) {


        DBService DBService = new DBService(new EmployeeService());
        DBService.save();
        DBService.delete();
        DBService.update();

    }
}
