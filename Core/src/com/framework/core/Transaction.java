package com.framework.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class Transaction implements ITransaction{
    protected double amount;
    protected Date timeStamp;
    protected Account account;

    public void addInterestToAllAccount(List<Account> accounts, double intRate){
        for (Account acc: accounts){
            double balance = acc.getBalance();
            balance = balance + (balance * (intRate / 100));
            acc.setBalance(balance);
            System.out.println("Interest has been added to account [" + acc.getAccountNumber() + "]");
        }
    }

    public abstract boolean compute();

    public Transaction(){
        timeStamp = getTimeStamp();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
