package com.framework.core.repo;

import com.framework.core.Account;
import com.framework.core.IAccount;
import com.framework.core.IParty;
import com.framework.core.ITransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by suraj on 4/18/2016.
 */
public class DefaultRepo implements IRepo {
    Map<IParty, List<IAccount>> customers;
    Map<IAccount, List<ITransaction>> transactions;

    private DefaultRepo(){
        customers = new HashMap<IParty, List<IAccount>>();
        transactions = new HashMap<IAccount, List<ITransaction>>();
    }

    private static DefaultRepo instance;
    public static DefaultRepo getInstance(){
        //Singleton Instance
        if(instance == null){
            instance = new DefaultRepo();
        }
        return instance;
    }



    @Override
    public boolean saveCustomer(IParty customer, List<IAccount> accounts) {
//       if(accounts.size() < 1){
//           return false;
//       }
        if(this.customers.containsKey(customer)){
            this.customers.get(customer).addAll(accounts);
            //System.out.println(this.customers);
            return true;
        }
        else {
            this.customers.put(customer, accounts);
            //System.out.println(this.customers);
            return true;
        }

    }

    @Override
    public boolean addTransactions(IAccount account, List<ITransaction> transactions) {
        this.transactions.put(account,transactions);
        return true;
    }

    @Override
    public IAccount getAccount(String accountNumber){
        IAccount found = null;

        System.out.println(customers.values());
        for (IParty party: this.customers.keySet()){
            for (IAccount account : party.getAllAccounts()){
                if(account.getAccountNumber().compareTo(accountNumber)==0){
                    found = account;
                    break;
                }
            }
        }

        return found;
    }

    @Override
    public List<Account> getAccounts() {
        List allAccounts = new ArrayList<>();
        for(List<IAccount> accounts : this.customers.values()){
            allAccounts.addAll(accounts);
        }
        return allAccounts;
    }

    @Override
    public Map<IParty, List<IAccount>> getCustomers() {
        return customers;
    }
}