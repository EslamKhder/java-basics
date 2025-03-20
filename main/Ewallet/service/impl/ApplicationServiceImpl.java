package main.Ewallet.service.impl;

import main.Ewallet.model.Account;
import main.Ewallet.service.AccountService;
import main.Ewallet.service.ApplicationService;

import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {

    private Scanner scanner = new Scanner(System.in);

    private AccountService accountService = new AccountServiceImpl();

    @Override
    public void start() {
        System.out.println("------------> HI SIR I hope to be good <------------");
        int counter = 0;
        while (true) {
            System.out.println("PLS enter your choose");
            System.out.println("1.login      2.create account       3.exit");

            int choose = scanner.nextInt();

            boolean exit = false;
            switch (choose) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    System.out.println("have a nice day :)");
                    exit = true;
                    break;
                default:
                    counter++;
                    if (counter != 4) {
                        System.out.println("Invalid Choose Pls try another one :(");
                    }
            }

            if (exit) {
                break;
            }

            if (counter == 4) {
                System.out.println("pls try later");
                break;
            }
        }
    }

    private void login() {
        System.out.println("login");
    }
    private void createAccount() {
        scanner.nextLine();

        System.out.println("*pls enter username.");
        String userName = scanner.nextLine();

        System.out.println("*pls enter password.");
        String password = scanner.nextLine();

        Account account = new Account(userName, password);

        boolean res = accountService.createAccount(account);

        if (res) {
            System.out.println("Account created successfully.");
        } else {
            System.out.println("there exist user name such as your user name you need to created. :(");
        }
    }
}
