package com.client.bank;

import com.framework.core.Account;


/**
 * Created by suraj on 4/18/2016.
 */
public class SavingAccount extends Account {

    public SavingAccount(String accNo){
        this.setAccountNumber(accNo);
        this.setType("Savings");
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
