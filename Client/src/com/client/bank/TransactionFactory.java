package com.client.bank;

import com.framework.core.Account;
import com.framework.core.Transaction;

import java.util.List;

/**
 * Created by Bijay on 4/18/2016.
 */
public class TransactionFactory {

    public static Transaction createInterestTransaction(List<Account> accounts, double intRate){
        return new Interest(accounts, intRate);
    }

    public static Transaction createTransaction(TransactionType type, Account account,Double d){
            if(type == TransactionType.DEPOSIT)
                return new Deposit(account,d);

            else if(type == TransactionType.WITHDRAW)
                return new Withdraw(account,d);
                //return new Withdraw(account,d);
            else
                return null;
        }

    }
