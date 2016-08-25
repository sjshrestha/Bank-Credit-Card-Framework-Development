package com.client.bank;

import com.framework.core.Account;
import com.framework.core.Transaction;

/**
 * Created by Bijay on 4/18/2016.
 */

//Deposit Command - Concrete Command
public class Deposit extends Transaction{
    Deposit(Account account,Double amount){
        super();
        this.account = account;
        this.amount = amount;
    }

    @Override
    public boolean compute(){
        System.out.println("At Client: " + this.getClass() + ": " + "(Compute)");
        account.setBalance(account.getBalance() + amount);
        return true;
    }
}
