package com.client.bank;

import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by suraj on 4/19/2016.
 */
public class EmailSenderCompanyFunctor implements Functor {

    Transaction tran;
    public EmailSenderCompanyFunctor(Transaction tran){
        this.tran = tran;
    }

    @Override
    public void pre() {

    }

    @Override
    public void post() {
        System.out.println("Email has been sent to company " + this.tran.getAccount().getAccountNumber());
    }
}
