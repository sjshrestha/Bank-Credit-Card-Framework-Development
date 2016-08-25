package com.framework.core;

import com.framework.core.repo.DefaultRepo;
import com.framework.core.repo.IRepo;

/**
 * Created by Bijay on 4/19/2016.
 **/
public abstract class Fincom {

    protected String name = "FINCO APP";
    protected final String VERSION = "1.0";

    protected Account account;
    protected Party customer;

    protected IRepo repo;
    protected IPartyController partyController;
    protected IAccountController accountController;
    protected ITransactionController transactionController;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Party getCustomer() {
        return customer;
    }

    public void setCustomer(Party customer) {
        this.customer = customer;
    }

    public IPartyController getPartyController() {
        return partyController;
    }

    public void setPartyController(IPartyController partyController) {
        this.partyController = partyController;
    }

    public IAccountController getAccountController() {
        return accountController;
    }

    public void setAccountController(IAccountController accountController) {
        this.accountController = accountController;
    }

    public ITransactionController getTransactionController() {
        return transactionController;
    }

    public void setTransactionController(ITransactionController transactionController) {
        this.transactionController = transactionController;
    }

    public void setRepo(IRepo repo){
        this.repo = repo;
    }

    public IRepo getRepo(){
        return this.repo;
    }

    public Fincom(){
        System.out.println("FinCom Status: Started");
        this.repo = DefaultRepo.getInstance();
        partyController = new PartyController(repo);
        accountController = new AccountController(repo);
        transactionController = createTransactionController();
        start();
    }

    protected abstract ITransactionController createTransactionController();
    protected abstract void start();
    protected abstract boolean createAccount();
    protected abstract boolean executeTransaction(ITransaction t);

    protected static void print(Object s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        print("Main In Framework");
    }

}
