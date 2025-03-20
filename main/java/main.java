package main.java;

import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {

        School school = ObjectController.getSpecificObject("main.java.Student");
        school.start();
    }
}
