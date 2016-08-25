package com.framework.core;

import com.framework.core.repo.IRepo;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class TransactionController implements ITransactionController{

    protected IRepo dbRepo;

    public TransactionController(IRepo repo){
        this.dbRepo = repo;
    }

    /*
     * Template Method pattern : IOC
     */
    @Override
    public boolean execute(ITransaction t) {
        t.compute();
        saveTransaction(((TransactionProxy)t).transaction); // client code
        return true;
    }


   /* public void saveTransaction(Transaction t){
        dbRepo.addTransactions(t.getAccount(), Arrays.asList(t));
    }*/
   protected abstract void  saveTransaction(Transaction t);

}
