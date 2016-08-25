package com.client.creditcard;

import com.framework.core.Account;
import com.framework.core.Transaction;

import java.util.List;

/**
 * Created by Bijay on 4/19/2016.
 */
public class Interest extends Transaction {
    public Interest(List<Account> accounts, double intRate) {

    }

    @Override
    public boolean compute() {
        return false;
    }
}
