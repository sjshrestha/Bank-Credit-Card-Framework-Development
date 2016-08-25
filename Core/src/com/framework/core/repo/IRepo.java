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
public interface IRepo {
//    boolean saveParty(IParty party);
//    boolean saveAcount(IAccount account);
//    boolean saveTransaction(ITransaction tran);

    boolean saveCustomer(IParty customer, List<IAccount> accounts);
    boolean addTransactions(IAccount account, List<ITransaction> transactions);
    IAccount getAccount(String accountNumber);
    List<Account> getAccounts();
    Map<IParty, List<IAccount>> getCustomers();
}
