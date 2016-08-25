package com.framework.sampleApp;

import com.framework.core.*;
import com.framework.core.repo.DefaultRepo;

/**
 * Created by suraj on 4/20/2016.
 */
public class SampleApp extends Fincom{
    @Override
    protected ITransactionController createTransactionController() {
        return new sampleAppTransactionController(DefaultRepo.getInstance());
    }

    @Override
    protected void start() {
        //write your startup code
        System.out.println("Sample application has been started...");
    }

    @Override
    protected boolean createAccount() {
        return false;
    }

    @Override
    public boolean executeTransaction(ITransaction t) {
        //write you code to execute transaction t
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Loading GUI");
        SampleAppGui gui = new SampleAppGui();
        gui.setBank(new SampleApp());
        gui.loadGui();
    }
}
