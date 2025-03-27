package main.Ewallet.service.impl;

import main.Ewallet.model.Account;
import main.Ewallet.service.AccountService;
import main.Ewallet.service.ApplicationService;
import main.Ewallet.service.DataValidation;

import java.util.Objects;
import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {

    private Scanner scanner = new Scanner(System.in);

    private AccountService accountService = new AccountServiceImpl();
    private DataValidation dataValidation = new DataValidationImpl();

    @Override
    public void start() {
        System.out.println("------------> HI SIR I hope to be good <-------------");
        int counter = 0;
        while (true) {
            System.out.println("PLS enter your choose");
            System.out.println("1.login      2.create account       3.exit");

            int choose = 0;
            try {
                choose = scanner.nextInt(); // sbc
            } catch (Exception exception) {
                System.out.println("pls enter number can't enter chars");
                scanner = new Scanner(System.in);
                continue;
            }

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
        scanner.nextLine();

        Account account = extractAccount();

        if (Objects.isNull(account)) {
            return;
        }

        boolean accountExits = accountService.findAccount(account);

        if (accountExits){
            mainPage(account);
        } else {
            System.out.println("Invalid username or password :(");
        }
    }

    private void mainPage(Account account) {
        System.out.println("a.deposit   b.withdraw  c.transfer  d.show profile details   e.exit");

        // TODO pls create switch case
        // TODO every case must match function and apply feature for (multi loop, 4 times invalid must out)

        int counter = 0;
        while (true) {
            char choose = scanner.next().charAt(0);

            boolean exit = false;
            switch (choose) {
                case 'a':
                    deposit(account);
                    break;
                case 'b':
                    withdraw(account);
                    break;
                case 'c':
                    transfer(account);
                    break;
                case 'd':
                    showProfileDetails(account);
                    break;
                case 'e':
                    System.out.println("thanks fro your time");
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

    private void showProfileDetails(Account account) {
        // TODO call account service to showProfileDetails
    }

    private void transfer(Account account) {
        // TODO take username of user you need to transfer
        // TODO take money that you need to transfer
        // TODO call account service to transfer
    }

    private void withdraw(Account account) {
        // TODO take money from user
        // TODO call account service to withdraw
    }

    private void deposit(Account account) {
        // TODO take money from user
        // TODO call account service to deposit
    }

    private void createAccount() {
        scanner.nextLine();

        Account account = extractAccount();

        if (Objects.isNull(account)) {
            return;
        }

        boolean accountCreated = accountService.createAccount(account);

        if (accountCreated) {
            System.out.println("Account created successfully.");
        } else {
            System.out.println("there exist user name such as your user name you need to created. :(");
        }
    }

    private Account extractAccount(){

        System.out.println("*pls enter username.");
        String userName = scanner.nextLine();

        if (!dataValidation.validateUserName(userName)) { // true false
            System.out.println("invalid username pls username size >= 3 and first char is upper");
            return null;
        }

        System.out.println("*pls enter password.");
        String password = scanner.nextLine();

        if (!dataValidation.validatePassword(password)) { // true false
            System.out.println("invalid password be size >= 6 and must contain number , char upper, char lower and special char");
            return null;
        }

        return new Account(userName, password);
    }


}
