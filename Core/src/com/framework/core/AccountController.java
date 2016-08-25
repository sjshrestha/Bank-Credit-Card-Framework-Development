package com.framework.core;

import com.framework.core.repo.IRepo;

import java.util.List;

/**
 * Created by Bereket on 4/18/2016.
 */
public class AccountController implements IAccountController{

    IRepo dbRepo;
    public AccountController(IRepo repo){
        this.dbRepo = repo;
    }

    @Override
    public void saveAccount(IAccount acc){

    }

    @Override
    public IAccount getAccount(String accNo) {
        return this.dbRepo.getAccount(accNo);
    }

    @Override
    public List<Account> getAccounts() {
        return this.dbRepo.getAccounts();
    }
}
