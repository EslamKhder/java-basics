package main.Ewallet.service;

import main.Ewallet.model.Account;

public interface AccountService {
    boolean createAccount(Account account);
    boolean findAccount(Account account);

    boolean deposit(Account account, double money);

    boolean withdraw(Account account, double money);

    boolean transfer(Account account, String transferAccount, double money);

    Account showProfileDetails(Account account);

}
