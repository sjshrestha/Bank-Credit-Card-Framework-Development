package com.framework.core;

import java.util.List;

/**
 * Created by Bereket on 4/18/2016.
 */
public interface IAccountController {
    public void saveAccount(IAccount acc);
    public IAccount getAccount(String accNo);
    public List<Account> getAccounts();
}
