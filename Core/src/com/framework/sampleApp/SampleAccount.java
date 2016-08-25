package com.framework.sampleApp;

import com.framework.core.Account;


/**
 * Created by suraj on 4/18/2016.
 */
public class SampleAccount extends Account {

    public SampleAccount(String accNo){
        this.setAccountNumber(accNo);
        this.setType("Checkings");
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
