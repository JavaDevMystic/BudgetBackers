package uz.pdp.springboot.account.service;

import uz.pdp.springboot.account.entity.Account;

import java.util.List;

public class AccountServiceImpl  implements AccountService{
    @Override
    public List<Account> getAccount() {
        return List.of();
    }

    @Override
    public Account getAccount(String theAccountNumber) {
        return null;
    }

    @Override
    public void saveAccount(Account theAccount) {

    }

    @Override
    public void updateAccount(Account theAccount) {

    }

    @Override
    public void removeAccount(String theAccountNumber) {

    }

    @Override
    public List<String> getAllAccountNumbers() {
        return List.of();
    }
}
