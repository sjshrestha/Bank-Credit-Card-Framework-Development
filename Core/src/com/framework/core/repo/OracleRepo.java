package com.framework.core.repo;

import com.framework.core.Account;
import com.framework.core.IAccount;
import com.framework.core.IParty;
import com.framework.core.ITransaction;

import java.util.List;
import java.util.Map;

/**
 * Created by suraj on 4/18/2016.
 */
public class OracleRepo implements IRepo{

    @Override
    public boolean saveCustomer(IParty customer, List<IAccount> accounts) {
        return false;
    }

    @Override
    public boolean addTransactions(IAccount account, List<ITransaction> transactions) {
        return false;
    }

    @Override
    public IAccount getAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public Map<IParty, List<IAccount>> getCustomers() {
        return null;
    }
}
