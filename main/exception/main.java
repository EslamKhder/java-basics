package main.exception;

import main.collection.User;
import main.collection.UserV1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt(); // abc
        } catch (Exception e) {
            System.out.println("ok");
        }

        System.out.println("hi");

    }
}
