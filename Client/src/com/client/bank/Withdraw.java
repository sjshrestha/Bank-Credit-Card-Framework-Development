package com.client.bank;

import com.framework.core.Account;
import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by Bijay on 4/19/2016.
 */
public class Withdraw extends Transaction {

    Withdraw(Account account, Double amount){
        super();
        this.account = account;
        this.amount = amount;
    }
    @Override
    public boolean compute() {
        account.setBalance(account.getBalance() - amount);
        return true;
    }
}
