package com.client.creditcard;

import com.framework.core.Account;

/**
 * Created by Bijay on 4/19/2016.
 */
public class Silver extends Account {
    private double monthlyIntrestPercentage = 10.00;
    private double minimumPaymentPercentage = 14.00;

    public double getMonthlyIntrestPercentage(){
        return this.monthlyIntrestPercentage;
    }

    public double getMinimumPaymentPercentage(){
        return  minimumPaymentPercentage;
    }

    public Silver(String accountNumber){
        this.setAccountNumber(accountNumber);
        this.setType("silver");
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
