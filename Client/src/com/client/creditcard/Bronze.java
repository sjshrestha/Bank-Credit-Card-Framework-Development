package com.client.creditcard;

import com.framework.core.Account;

/**
 * Created by Bijay on 4/19/2016.
 */
public class Bronze extends Account{

    private double monthlyIntrestPercentage = 10.00;
    private double minimumPaymentPercentage = 14.00;

    public double getMonthlyIntrestPercentage(){
        return this.monthlyIntrestPercentage;
    }

    public double getMinimumPaymentPercentage(){
        return  minimumPaymentPercentage;
    }

    public Bronze(String accountNumber){
        this.setType("bronze");
        this.setAccountNumber(accountNumber);
    }

    @Override
    public String getPartyType() {
        return "Personal";
    }
}
