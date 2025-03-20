package main.threads;

public class main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(500); // Shared bank account

        // Creating multiple customers (threads)
        Customer customer1 = new Customer(sharedAccount, "Alice");
        Customer customer2 = new Customer(sharedAccount, "Bob");
        Customer customer3 = new Customer(sharedAccount, "Charlie");

        // Starting threads
        customer1.start();
        customer2.start();
        customer3.start();
    }
}
