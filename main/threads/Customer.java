package main.threads;

public class Customer extends Thread {
    private BankAccount account;
    private String customerName;

    public Customer(BankAccount account, String name) {
        this.account = account;
        this.customerName = name;
    }

    @Override
    public void run() {
        // Simulate banking transactions
        account.deposit(100, customerName);
        account.withdraw(50, customerName);
        account.withdraw(200, customerName);
    }
}