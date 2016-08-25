package com.client.bank;

import com.framework.core.Account;


/**
 * Created by suraj on 4/18/2016.
 */
public class AccountFactory  {

    public static AccountFactory getInstance() {
        return new AccountFactory();
    }



    public Account createAccount(String type, String accNo) {
        if(type == "Savings")
            return new SavingAccount(accNo);
        else
            return new CheckingAccount(accNo);
    }
}
