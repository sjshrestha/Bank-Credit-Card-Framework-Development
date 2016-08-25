package com.client.bank;

import com.framework.core.ITransactionController;
import com.framework.core.Transaction;
import com.framework.core.TransactionController;
import com.framework.core.repo.DefaultRepo;
import com.framework.core.repo.IRepo;

import java.util.Arrays;

/**
 * Created by Bijay on 4/19/2016.
 */
public class BankTransactionController extends TransactionController {

    private  static BankTransactionController ctrl = null;
    /*singleton*/

    public static ITransactionController getBankTransactionController(){
        if(ctrl == null)
            ctrl = new BankTransactionController(DefaultRepo.getInstance());
        return ctrl;
    }

    private BankTransactionController(IRepo repo){
        super(repo);
    }

    /*framework will call this method; template method pattern*/
    @Override
    protected void saveTransaction(Transaction t) {
        System.out.println("Framework called this:"+this.getClass() + "(saveTransaction)");
        System.out.println("Transaction has been saved.");
        this.dbRepo.addTransactions(t.getAccount(), Arrays.asList(t));
    }
}
