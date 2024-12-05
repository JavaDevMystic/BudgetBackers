package uz.pdp.springboot.account.service;

import uz.pdp.springboot.account.entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccount();

    public Account getAccount(String theAccountNumber);

    public void saveAccount(Account theAccount);

    public void updateAccount(Account theAccount);

    public void removeAccount(String theAccountNumber);

    public List<String> getAllAccountNumbers();
}
