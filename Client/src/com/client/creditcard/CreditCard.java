package com.client.creditcard;


import com.framework.core.Fincom;
import com.framework.core.ITransaction;
import com.framework.core.ITransactionController;

/**
 * Created by Bijay on 4/19/2016.
 */
public class CreditCard extends Fincom {


    @Override
    protected ITransactionController createTransactionController() {
        return CreditCardTransactionController.getCreditCardTransactionController();
    }

    @Override
    protected void start() {
        print(" Based on : " + this.name+ " " + VERSION + " Framework.");
    }

    @Override
    protected boolean createAccount() {
        return false;
    }

    @Override
    protected boolean executeTransaction(ITransaction t) {
        return this.transactionController.execute(t);
    }

    public static void main(String[] args) {
        System.out.println("Loading GUI");
        CardGui gui = new CardGui();
        gui.setBank(new CreditCard());
        gui.loadGui();
    }
}
