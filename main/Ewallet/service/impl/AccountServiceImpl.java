package main.Ewallet.service.impl;

import main.Ewallet.model.Account;
import main.Ewallet.model.WalletSystem;
import main.Ewallet.service.AccountService;

import java.util.List;

/**
  if any duplication on code pls resolve
 */
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

    @Override
    public boolean findAccount(Account account) {
        List<Account> accounts = walletSystem.getAccounts(); // 5

        for(int i=0;i<accounts.size();i++){ // 0    0<5   0 1 2 3 4
            if (accounts.get(i).getUserName().equals(account.getUserName())
                && accounts.get(i).getPassword().equals(account.getPassword())){
                    return true;
                }
        }

        return false;
    }

    @Override
    public boolean deposit(Account account, double money) {
        /* TODO
             * check if account exist on ewallet if account not exist return false
             * add  money to account if success return true
        * */
        return false;
    }

    @Override
    public boolean withdraw(Account account, double money) {
        /*  TODO
            * check if account exist on ewallet if account not exist return false
            * check if money (greater than) of account balance return false
            * cut  money from account if success return true
         * */
        return false;
    }

    @Override
    public boolean transfer(Account account, String transferAccount, double money) {

        /*  TODO
         * check if account exist on ewallet if account not exist return false
         * check if transferAccount exist on ewallet if account not exist return false
         * check if money (greater than) of account balance return false
         * cut money from account if and add to transferAccount success return true
         * */
        return false;
    }

    @Override
    public Account showProfileDetails(Account account) {
        /* TODO
             check if account exist on ewallet if account not exist return false
             if exist return account  if not exist return null

         */
        return null;
    }

    // TODO pirvate function to check if account exist on ewallet
}
