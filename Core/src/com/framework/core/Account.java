package com.framework.core;

import java.util.Random;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class Account implements IAccount {
    private String accountNumber;
    private double balance;
    private String currency;
    private String type;

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getCurrentBalance(){
        return this.balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String generateAccountNumber(String prefix){
        long rand = new Random().nextLong();
        rand = (rand < 0) ? rand * -1: rand;
        String ans="";
        if(prefix.trim() ==""){
            ans +=rand;
        }
        else
        {
            ans +=prefix + " - " +rand;
        }
        return ans;
    }

    @Override
    public String toString() {
        return this.getAccountNumber();
    }
}
