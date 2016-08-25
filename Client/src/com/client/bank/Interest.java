package com.client.bank;

import com.framework.core.Account;
import com.framework.core.Transaction;

import java.util.List;

/**
 * Created by suraj on 4/19/2016.
 */
public class Interest extends Transaction {

    List<Account> accounts;
    double interestRate;

    public Interest(List<Account> accounts, double intRate){
        this.accounts = accounts;
        this.interestRate = intRate;
    }

    @Override
    public boolean compute() {
        this.addInterestToAllAccount(this.accounts, this.interestRate);
        return true;
    }
}
