package com.client.bank;

import com.framework.core.Account;
import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by suraj on 4/19/2016.
 */
public class EmailSenderPersonFunctor implements Functor {

    private Transaction tran;

    public EmailSenderPersonFunctor(Transaction tran){
        this.tran = tran;
    }

    @Override
    public void pre() {

    }

    @Override
    public void post() {
        if(this.tran.getAmount() > 500 || this.tran.getAccount().getCurrentBalance() < 0){
            System.out.println("Email has been sent to person " + this.tran.getAccount().getAccountNumber());
        }
    }
}
