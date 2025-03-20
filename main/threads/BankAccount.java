package main.threads;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount, String name) {
        balance += amount;
        System.out.println(name + " deposited " + amount + ". New balance: " + balance);
    }

    // Synchronized withdrawal method
    public synchronized void withdraw(double amount, String name) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(name + " attempted to withdraw " + amount + " but insufficient funds! Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
