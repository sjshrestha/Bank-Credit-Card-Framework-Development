package com.client.creditcard;

import com.framework.core.ITransactionController;
import com.framework.core.Transaction;
import com.framework.core.TransactionController;
import com.framework.core.repo.DefaultRepo;
import com.framework.core.repo.IRepo;

import java.util.Arrays;

/**
 * Created by Bijay on 4/19/2016.
 */
public class CreditCardTransactionController extends TransactionController{
    private  static CreditCardTransactionController ctrl = null;

    /*singleton*/
    public static ITransactionController getCreditCardTransactionController(){
        if(ctrl == null)
            ctrl = new CreditCardTransactionController(DefaultRepo.getInstance());
        return ctrl;
    }

    private CreditCardTransactionController(IRepo repo){
        super(repo);
    }

    @Override
    protected void saveTransaction(Transaction t) {
        System.out.println("Framework called this:"+this.getClass() + "(saveTransaction)");
        this.dbRepo.addTransactions(t.getAccount(), Arrays.asList(t));
    }
}
