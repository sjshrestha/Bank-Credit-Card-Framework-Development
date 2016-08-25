package com.framework.core;

import java.util.List;

/**
 * Created by Bereket on 4/18/2016.
 */
public interface IParty {

    boolean addAccount(IAccount acc);
    boolean removeAccount(IAccount acc);
    List<IAccount> getAllAccounts();
    Account getAccount(String accountNumber);
    void update();
}
