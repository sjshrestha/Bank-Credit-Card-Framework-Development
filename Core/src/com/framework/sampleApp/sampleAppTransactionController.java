package com.framework.sampleApp;

import com.framework.core.Transaction;
import com.framework.core.TransactionController;
import com.framework.core.repo.IRepo;

/**
 * Created by suraj on 4/20/2016.
 */
public class sampleAppTransactionController extends TransactionController {

    public sampleAppTransactionController(IRepo repo){
        super(repo);
    }

    @Override
    protected void saveTransaction(Transaction t) {
        //write your code to save transaction T
        System.out.println("Transaction has been saved...");
    }
}
