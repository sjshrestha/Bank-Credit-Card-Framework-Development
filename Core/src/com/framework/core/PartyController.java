package com.framework.core;

import com.framework.core.repo.IRepo;

import java.util.List;
import java.util.Map;

/**
 * Created by Bereket on 4/18/2016.
 */
public class PartyController implements IPartyController{
    private IRepo dbRepo;
    public PartyController(IRepo repo){
        this.dbRepo = repo;
    }

    public List<IParty> partyList;

    @Override
    public void saveParty(IParty p){
        dbRepo.saveCustomer(p,p.getAllAccounts());
        System.out.println("Saving done. thank you");
    }

    @Override
    public List<IParty> getParty(){
        return null;
    }

    @Override
    public IAccount getAccount(String accnr) {
        return dbRepo.getAccount(accnr);
    }
    @Override
    public Map<IParty, List<IAccount>> getCustomers(){return dbRepo.getCustomers();}
}
