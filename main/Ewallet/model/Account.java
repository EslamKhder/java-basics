package main.Ewallet.model;

public class Account {
    private String userName;
    private String password;
    private boolean active;

    private double balance;

    public Account() {
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
        active = true;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
