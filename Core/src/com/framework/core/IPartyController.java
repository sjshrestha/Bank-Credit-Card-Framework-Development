package com.framework.core;

import java.util.List;
import java.util.Map;

/**
 * Created by Bereket on 4/18/2016.
 */
public interface IPartyController {

    public void saveParty(IParty p);
    public List<IParty> getParty();

    IAccount getAccount(String accnr);
    public Map<IParty, List<IAccount>> getCustomers();
}
