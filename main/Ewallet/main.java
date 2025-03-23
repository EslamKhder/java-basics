package main.Ewallet;

import main.Ewallet.service.ApplicationService;
import main.Ewallet.service.impl.ApplicationServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //  types of error on pro     1. syntax error       2.logical error     3. Runtime Error

        ApplicationService applicationService = new ApplicationServiceImpl();
        applicationService.start();

    }
}

/*

//  types of error on pro     1. syntax error       2.logical error     3. Runtime Error
        boolean con = false;
        try {
            System.out.println("start app to connect with db");
            con = true;
            System.out.println(5 / 0 + 1);
        } catch (Exception exception) {
            System.out.println("invalid connection");
            return;
        } finally {
            con = false;
            System.out.println("connection closed");
        }
 */