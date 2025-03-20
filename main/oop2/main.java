package main.oop2;

public class main {
    public static void main(String[] args) {

        StudentService privateSchoolService1 = new PrivateSchoolService();
        privateSchoolService1.printStudent();
        privateSchoolService1.printTeacher();
        privateSchoolService1.printEmployee();

        TeacherService privateSchoolService2 = new PrivateSchoolService();
        privateSchoolService2.printTeacher();

        EmployeeService privateSchoolService4 = new PrivateSchoolService();
        privateSchoolService4.printEmployee();

        PrivateSchoolService privateSchoolService3 = new PrivateSchoolService();
        privateSchoolService3.printStudent();
        privateSchoolService3.printTeacher();
        privateSchoolService3.printEmployee();
        privateSchoolService3.show();



    }
}
