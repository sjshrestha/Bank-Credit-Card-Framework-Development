package com.client.creditcard;

import com.framework.core.Account;

/**
 * Created by Bijay on 4/19/2016.
 */
public class Gold extends Account {
    private double monthlyIntrestPercentage = 6.00;
    private double minimumPaymentPercentage = 10.00;

    public double getMonthlyIntrestPercentage(){
        return this.monthlyIntrestPercentage;
    }

    public double getMinimumPaymentPercentage(){
        return  minimumPaymentPercentage;
    }

    public Gold(String accountNumber){
        this.setAccountNumber(accountNumber);
        super.setType("gold");
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
