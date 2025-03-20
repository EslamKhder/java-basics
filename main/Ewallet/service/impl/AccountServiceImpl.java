package main.Ewallet.service.impl;

import main.Ewallet.model.Account;
import main.Ewallet.model.WalletSystem;
import main.Ewallet.service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private WalletSystem walletSystem = new WalletSystem();

    @Override
    public boolean createAccount(Account account) {
        List<Account> accounts = walletSystem.getAccounts(); // 5

        for(int i=0;i<accounts.size();i++){ // 0    0<5   0 1 2 3 4
            if (accounts.get(i).getUserName().equals(account.getUserName())){
                return false;
            }
        }

        walletSystem.getAccounts().add(account);
        return true;
    }
}
