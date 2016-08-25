package com.framework.core;

/**
 * Created by Bereket on 4/18/2016.
 */
public class TransactionProxy implements ITransaction {
    public Transaction transaction;
    private Functor worker;

    public TransactionProxy(Transaction tran, Functor worker){
        this.transaction = tran;
        this.worker = worker;
    }

    public boolean compute(){
        this.worker.pre();
        this.transaction.compute();
        this.worker.post();

        return true;
    }
}
