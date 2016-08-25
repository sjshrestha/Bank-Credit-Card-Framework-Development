package com.framework.sampleApp;

import com.framework.core.Account;
import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by suraj on 4/20/2016.
 */
public class SampleTransaction extends Transaction {

    String accNo;
    public SampleTransaction(String a){
        this.accNo = a;
    }

    @Override
    public boolean compute() {
        System.out.println("Sample transaction has been applied on account [" + this.accNo + "]");
        return true;
    }
}
