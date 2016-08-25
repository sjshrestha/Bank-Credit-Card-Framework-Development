package com.client.bank;

import com.framework.core.Account;


/**
 * Created by suraj on 4/18/2016.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String accNo){
        this.setAccountNumber(accNo);
        this.setType("Checkings");
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
